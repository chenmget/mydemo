package com;

import com.model.Person;
import com.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class elasticSearchTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void save(){
        Person person = new Person(1L, "名字", 33);
        personRepository.save(person);
    }


}
