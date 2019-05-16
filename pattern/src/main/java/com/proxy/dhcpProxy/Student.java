package com.proxy.dhcpProxy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student implements Person{

    private String name;

    @Override
    public void giveMoney() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"上交10元");
    }
}
