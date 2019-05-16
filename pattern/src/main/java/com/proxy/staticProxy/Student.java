package com.proxy.staticProxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student implements  Person{
    private String name;

    @Override
    public void giveMoney() {
        System.out.println(name+"上交了十元");
    }
}
