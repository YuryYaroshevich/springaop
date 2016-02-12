package com.epam.springaop.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(** com.epam.springaop.concert.Performance.perform(..))")
	public void performance() {}
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("silencing cell phones");
	}
	
	@Before("performance()")
	public void takeSeates() {
		System.out.println("taking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
