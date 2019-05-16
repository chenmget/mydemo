package com.proxy.dhcpProxy;

public class MonitorUtil {
    private static ThreadLocal<Long> t1=new ThreadLocal<>();

    public static void start(){
        t1.set(System.currentTimeMillis());
    }

    public static void end(String methodName){
        System.out.println(methodName+"总共耗时："+(System.currentTimeMillis()-t1.get()));
    }

}
