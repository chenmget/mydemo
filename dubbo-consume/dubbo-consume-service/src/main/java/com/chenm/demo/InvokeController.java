package com.chenm.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class InvokeController {


    @RequestMapping("/hello")
    public String test(){
       new Invoke().testDubbo("1");
        return "success";
    }
}
