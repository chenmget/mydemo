package com.proxy;

import com.proxy.dhcpProxy.Person;
import com.proxy.dhcpProxy.StuInvocationHandler;
import com.proxy.dhcpProxy.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class dhcpProxyTest {
    public static void main(String[] args) {
        Person person=new Student("张三");
        InvocationHandler handler=new StuInvocationHandler<Person>(person);
        Person proxy= (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, handler);
        proxy.giveMoney();
    }
}
