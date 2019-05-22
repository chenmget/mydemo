package com.chenm.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chenm.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class Invoke {

    @Reference
    private DemoService demoService;

    public void testDubbo(String id){
        demoService.hello(id);
    }
}
