//package com.blog.tiblog.aspect;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//
//@Aspect
//@Slf4j
//@Component
//public class ShowLogAspect {
//
//    @Around("execution(* com.blog.tiblog.member..*(..))")
//    public Object accessMemberLog(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        log.info("[Signature] : " + joinPoint.getSignature());
//        for (Object arg : joinPoint.getArgs()) {
//            log.info("args: " + arg);
//        }
//        return joinPoint.proceed();
//
//    }
//
//}
