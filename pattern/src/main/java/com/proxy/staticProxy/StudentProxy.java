package com.proxy.staticProxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class StudentProxy implements Person{
    private Student stu;

    @Override
    public void giveMoney() {
        System.out.println("代理了一下");
        stu.giveMoney();
    }
}
