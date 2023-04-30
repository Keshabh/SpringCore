package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
		Person p1 = (Person)context.getBean("person1");
		System.out.println(p1);
		
		Person p2 = (Person)context.getBean("person2");
		System.out.println(p2);
		
		Addition obj = (Addition)context.getBean("add1");
		obj.add();

	}

}
