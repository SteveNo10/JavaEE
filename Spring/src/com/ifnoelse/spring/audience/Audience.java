package com.ifnoelse.spring.audience;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	@Pointcut("execution(* com.ifnoelse.spring.perform.Perform.performing(..))")
	public void performing() {
		
	}
	
	@Before("performing()")
	public void takeSeats() {
		System.out.println("take seats");
	}
	
	@Before("performing()")
	public void turnOffCellPhones() {
		System.out.println("turn off cellphones");
	}
	
	@AfterReturning("performing()")
	public void applaud() {
		System.out.println("CLAP CLAP CLAP...");
	}
	
	@AfterThrowing("performing()")
	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}
}
