package com.springcore.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Emp emp = context.getBean("employee1",Emp.class);
		System.out.println(emp);
		
		Manager mg = context.getBean("mg1",Manager.class);
		System.out.println(mg);
	}

}
