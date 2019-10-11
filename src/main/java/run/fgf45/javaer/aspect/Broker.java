package run.fgf45.javaer.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Broker {

   /* @Pointcut("execution(* run.fgf45.javaer.entity.Landlord.service())")
    public void IService(){}


    @Before("IService()")
    public void before(){
        System.out.println("带租客看房");
        System.out.println("谈价格");
    }

    @After("IService()")
    public void after(){
        System.out.println("交钥匙");
    }*/

    //  使用 @Around 注解来同时完成前置和后置通知
    @Around("execution(* run.fgf45.javaer.entity.Landlord.service())")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("带租客看房");
        System.out.println("谈价格1");

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("交钥匙");
    }

}

