package com.chenm.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chenm.ConsumeApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumeApplication.class)
public class DemoTest {

    @Reference
    private DemoService demoService;

    @Test
    public void demoTest(){
        demoService.hello("chenm");
    }
}
