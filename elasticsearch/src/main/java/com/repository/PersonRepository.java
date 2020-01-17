package com.repository;

import com.model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends ElasticsearchRepository<Person,Long> {
}
