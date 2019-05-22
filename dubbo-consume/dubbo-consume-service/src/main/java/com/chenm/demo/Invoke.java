package com.chenm.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class Invoke {

    @Reference
    private DemoService demoService;

    public void testDubbo(){
        String name="chenm";
        demoService.hello(name);
    }
}
