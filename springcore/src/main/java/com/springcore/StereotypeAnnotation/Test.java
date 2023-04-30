package com.springcore.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/StereotypeAnnotation/config.xml");
		A ob = (A)context.getBean("obj");
		System.out.println(ob);
		
		//everybean has singleton scope, which means when called, for a class, they will refer to the same object.
		//but this can be changed with prototype annotation as @Scope("prototype")
		
		Spel sp = context.getBean("spel",Spel.class);
		System.out.println(sp);

	}

}
