package com.chenm.demo;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DemoServiceImp implements DemoService {

    @Override
    public void hello(String name) {
        System.out.println(name + " say hello");
    }
}
