package com.example.aopconcept.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class EmployeeAspect {

@Before(value = "execution(* com.example.aopconcept.controller.EmployeeController.*(..))")
public void beforeAdvice(JoinPoint joinPoint){
    System.out.println("Request to " + joinPoint.getSignature() + "stated at " + new Date());
}



}
