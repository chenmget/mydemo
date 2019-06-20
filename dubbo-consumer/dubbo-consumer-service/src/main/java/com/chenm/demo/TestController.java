package com.chenm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestController {

    @Autowired
    private DubboInvoke dubboInvoke;

    @RequestMapping("/hello")
    public String test(){
        dubboInvoke.testDubbo("1");
        return "success";
    }
}
