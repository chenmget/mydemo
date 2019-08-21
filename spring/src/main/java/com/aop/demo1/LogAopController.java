package com.aop.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogAopController {

    @Autowired
    private LogService logService;

    @RequestMapping("/test")
    public void test(){
        logService.say("chenm");
    }

    @RequestMapping("/test1")
    public String test1(String key){
        logService.say("chenm");
        return key;
    }
}
