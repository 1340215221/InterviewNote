package com.rh.code.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 自定义切面
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.rh.code.aop.*Action.*(..))")
    public void matchMethod() {}

    @Pointcut("@annotation(com.rh.code.aop.MyAnnotation)")
    public void matchAnnotation() {}

    @Around("matchMethod() && matchAnnotation()")
    public Object handleSwingAsync(ProceedingJoinPoint joinPoint) throws Throwable {
        // 前置处理
        Object result = joinPoint.proceed();
        // 后置处理
        return result;
    }

    /**
     * 获得方法名
     */
    public String getMethodName(ProceedingJoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        return signature.getName();
    }

    /**
     * 获得方法传入参数
     */
    public Object[] getArgs(ProceedingJoinPoint joinPoint) {
        return joinPoint.getArgs();
    }

    /**
     * 获得注解参数
     */
    public String getAnnotationParam(ProceedingJoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        return annotation.value();
    }
}
