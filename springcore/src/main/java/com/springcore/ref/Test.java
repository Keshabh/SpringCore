package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ref/RefConfig.xml");
		A ob = (A)context.getBean("a");
		System.out.println(ob);

	}

}
