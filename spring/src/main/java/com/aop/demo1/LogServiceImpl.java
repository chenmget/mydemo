package com.aop.demo1;


import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements  LogService {

    @Override
    @DoneTime
    public void say(String name) {
        System.out.println("logService say "+name);
    }
}
