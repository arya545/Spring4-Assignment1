package com.acad.spring4Assignment1;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

//Defining Method before advice

public class MyAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Executing : "+arg0);
	}
	
	

}
