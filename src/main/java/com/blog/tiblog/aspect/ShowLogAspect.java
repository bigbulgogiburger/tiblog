package com.blog.tiblog.aspect;


import com.blog.tiblog.member.dto.InfoDto;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Slf4j
@Component
public class ShowLogAspect {



    @Before("execution(* com.blog.tiblog.member..*(..))")
    public void beforeProceed(JoinPoint joinPoint) {
        log.info("before proceed : " + joinPoint.getSignature());
    }

    @AfterReturning("execution(* com.blog.tiblog.member..*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        log.info("afterReturning proceed : " + joinPoint.getSignature());
    }

    @AfterThrowing("execution(* com.blog.tiblog.member..*(..))")
    public void AfterThrowing(JoinPoint joinPoint) {
        log.info("AfterThrowing proceed : " + joinPoint.getSignature());
    }

    @After("execution(* com.blog.tiblog.member..*(..))")
    public void after(JoinPoint joinPoint) {
        log.info("after proceed : " + joinPoint.getSignature());
    }


//    @Before("execution(* com.blog.tiblog.member..*(..))&& args(arg,..)")
//    public void testMemberLog(InfoDto arg) {
//        System.out.println("arg = " + arg);
//        arg.setId("@#$@#$@#$@#$");
//
//    }

//    @Around("execution(* com.blog.tiblog.member..*(..))")
//    public Object accessMemberLog(ProceedingJoinPoint joinPoint) throws Throwable {
//        log.info("[Signature] : " + joinPoint.getSignature());
//        for (Object arg : joinPoint.getArgs()) {
//            log.info("args: " + arg);
//        }
//        return joinPoint.proceed();
//    }

}