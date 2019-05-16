package com.proxy;

import com.proxy.staticProxy.Student;
import com.proxy.staticProxy.StudentProxy;

public class staticProxyTest {
    public static void main(String[] args) {
        StudentProxy proxy=new StudentProxy(new Student("张三"));
        proxy.giveMoney();
    }
}
