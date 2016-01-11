package com.zwb.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	/*1通过一个@Apsect标注，表示LogAspect是一个切面，解决了What问题。 
	2通过定义一个标注了@Pointcut的方法，定义了Where的问题，"execution(* com.tianmaying.aopdemo..*.bookFlight(..))"表示在
	com.tianmaying.aopdemo包或者子包种调用名称为bookFlight的地方就是切入点！定义Pioncut的语法这里不详解了
	，David这里要告诉你的时它的作用：解决Where的问题！
	3通过一个@AfterReturning标注表示在bookFlight()调用之后将切面织入，
	这是一个AfterReturning类型的Advice，注意这里可以通过returning属性获取bookFlight()的返回值。 
	4这里定义了实现切面功能的代码，经过这么一番闪转腾挪，最后写日志的代码跑到这里来了！*/
	//@Pointcut("execution(* com.zwb.controller..*.bookFlight(..))") //2
    private void logPointCut() {
    }

    //@AfterReturning(pointcut = "logPointCut()", returning = "retVal") //3
    public void logBookingStatus(boolean retVal) {  //4
    	System.out.println("进入log aspect");
        if (retVal) {
            System.out.println("booking flight succeeded!");
        } else {
            System.out.println("booking flight failed!");
        }
    }
}
