package com.aop.demo1;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class DoneTimeAspect {
    @Around("@annotation(DoneTime)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("方法开始时间是:"+new Date());
        Object o = pjp.proceed();
        System.out.println("param----"+JSON.toJSONString(pjp.getArgs()));
        System.out.println("方法结束时间是:"+new Date()) ;
        return o;
    }
}
