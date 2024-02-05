package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.JobKOctets;
import java.lang.reflect.Method;

@Aspect
@Component //스프링 관리
public class ParameterAop {

    //aop 설정
    @Pointcut("execution(* com.example.demo.aop.controller.*.*(..))")
    private void cut(){


    }

    @Before("cut()")
    public void before(JoinPoint joinPoint){

        MethodSignature methodSignature= (MethodSignature) joinPoint.getSignature();
        Method method= methodSignature.getMethod();
        System.out.println(method.getName());

        //아큐먼트 찾기
        Object[] args= joinPoint.getArgs(); //메소드에들어가있는 아규먼트

        for(Object obj: args){
            System.out.println("type:"+obj.getClass().getSimpleName());
            System.out.println("value"+obj);
        }
    }

    @AfterReturning(value = "cut()", returning = "returnObj")
    public void afterReturn(JoinPoint joinPoint, Object returnObj){
        System.out.println("return obj");
        System.out.println(returnObj);

    }

}
