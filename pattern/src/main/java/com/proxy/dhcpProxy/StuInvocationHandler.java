package com.proxy.dhcpProxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
public class StuInvocationHandler<T> implements InvocationHandler {

    T target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理方法");
        MonitorUtil.start();

        Object result=method.invoke(target,args);

        MonitorUtil.end(method.getName());
        return result;
    }
}
