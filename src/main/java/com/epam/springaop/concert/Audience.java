package com.epam.springaop.concert;

import org.aspectj.lang.ProceedingJoinPoint;

//@Aspect
public class Audience {
	//@Pointcut("execution(** com.epam.springaop.concert.Performance.perform(..))")
	public void performance() {}
	
	//@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("silencing cell phones");
	}
	
	//@Before("performance()")
	public void takeSeates() {
		System.out.println("taking seats");
	}
	
	//@AfterReturning("performance()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!");
	}
	
	//@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
	
	//@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
	    try {
	       silenceCellPhones();
	       takeSeates();
	       joinPoint.proceed();
	    } catch (Throwable e) {
	        demandRefund();
	        System.out.println(e);
	    }
	}
}
