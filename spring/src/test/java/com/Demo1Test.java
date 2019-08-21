package com;

import com.aop.demo1.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringDemoApplication.class})
public class Demo1Test {

    @Autowired(required = true)
    private LogService logService;

    @Test
    public void testOne(){
        logService.say("chenm");
    }
}
