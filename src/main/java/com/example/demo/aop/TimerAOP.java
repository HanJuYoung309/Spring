package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
//특정 메소드의 실행시간
public class TimerAOP {
    @Pointcut("execution(* com.example.demo.aop.controller.*.*(..))")
    private void cut(){


    }

    @Pointcut("@annotation(com.example.demo.aop.annotation.Timer)")
    private void enableTimer(){

    }

    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        StopWatch stopWatch= new StopWatch();
        stopWatch.start();

        Object result=joinPoint.proceed();

        stopWatch.stop();

        System.out.println("total time"+ stopWatch.getTotalTimeSeconds());
    }

}
