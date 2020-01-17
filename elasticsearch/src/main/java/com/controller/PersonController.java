package com.controller;

import com.model.Person;
import com.repository.PersonRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PersonController {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("save")
    public Object save() {
        Person person = new Person(1L, "名字", 33);
        return personRepository.save(person);
    }

    @GetMapping("person/{id}")
    public Object get(@PathVariable Long id) {
        Person person = personRepository.findOne(id);
        if (person!=null) {
            return person;
        }
        return null;
    }

    @GetMapping("delete")
    public Object delete() {
        personRepository.delete(new Person(1L, "a", 23));
        return "success";
    }

    @GetMapping("persons")
    public List<Person> query() {
        Iterable<Person> iterable = personRepository.findAll();
        Iterator<Person> personIterator = iterable.iterator();
        List<Person> list = new ArrayList<>();
        while (personIterator.hasNext()){
            Person p = personIterator.next();
            list.add(p);
        }
        return list;
    }

    @GetMapping("persons/{name}/{text}")
    public List<Person> list(@PathVariable String name, @PathVariable String text) {
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        queryBuilder.withQuery(QueryBuilders.termQuery(name, text));
        Page<Person> items = personRepository.search(queryBuilder.build());
        //long totalElements = items.getTotalElements();
//        HashMap<String, Object> hashMap = new HashMap<>(8);
//        hashMap.put("count", totalElements);
//        hashMap.put("items", items);
        return items.getContent();
    }

    @GetMapping("persons/{page}")
    public List<Person> searchByPage(@PathVariable String page) {
        // 构建查询条件
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 添加基本分词查询
        queryBuilder.withQuery(QueryBuilders.termQuery("name", "bb"));
        // 分页：
        int pageNo = Integer.parseInt(page);
        int size = 2;
        queryBuilder.withPageable( new PageRequest(pageNo, size));
        // 搜索，获取结果
        Page<Person> items = personRepository.search(queryBuilder.build());
        List<Person> list = items.getContent();
        return list;
    }

}
