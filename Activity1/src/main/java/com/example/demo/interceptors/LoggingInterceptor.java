package com.example.demo.interceptors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Around("execution(* com.example.demo..*(..))")
    public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Entering method: {}.{}", className, methodName);
        try {
            Object result = joinPoint.proceed();
            logger.info("Exiting method: {}.{}", className, methodName);
            return result;
        } catch (Exception e) {
            logger.error("Exception in method: {}.{} - {}", className, methodName, e.getMessage());
            throw e;
        }
    }
}

