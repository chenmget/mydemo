package com.chenm.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class InvokeController {
    @Reference
    private DemoService demoService;

    @RequestMapping("/hello")
    public String test(){
        String name="chenm";
        demoService.hello(name);
        return "success";
    }
}
