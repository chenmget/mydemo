package com.redis;

import com.SpringDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: mydemo
 * @description: redis测试类
 * @author: cm
 * @create: 2020-01-04 11:14
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringDemoApplication.class})
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedisTemplate(){
        redisTemplate.opsForHash().put("order", "1", "order1");
    }

}
