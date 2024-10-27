package com.example.SpringSampleProject.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
public class LogAspect {
    @Before("execution(* com.example.SpringSampleProject.service.*.*(..))")
    public void logBefore(){
        System.out.println("Logging before method execution.");
    }

    @After("execution(* com.example.SpringSampleProject.service.*.*(..))")
    public void logAfter(){
        System.out.println("Logging after method execution.");
    }

    @Around("execution(* com.example.SpringSampleProject.service.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        Object[] args = joinPoint.getArgs();

        if (args != null && args.length > 0) {
            List<Object> list = new ArrayList<>();
            for (var a : args){
                System.out.println("around : before execution : args = " + a);
                if (a instanceof String val){
                    list.add("Task name(%s - %s)".formatted(val, Instant.now().toEpochMilli()));
                } else {
                    list.add(a);
                }
            }
            args = list.toArray();
        }

        Object result = joinPoint.proceed(args);
        System.out.println("around : after execution : result = " + result);

        return result;
    }
}
