package com.springcore.annotationAutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.StandAloneCollections.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/annotationAutoWire/autoWireConfig.xml");
		Emp emp = (Emp)context.getBean("emp");
		System.out.println(emp);
		
	}

}
