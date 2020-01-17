package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@Document(indexName = "indexperson",type = "person")
public class Person {
    private Long id;
    private String name;
    private int age;
}
