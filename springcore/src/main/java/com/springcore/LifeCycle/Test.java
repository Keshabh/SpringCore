package com.springcore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/LifeCycle/lifeCycleConfig.xml");
      Bus b = (Bus)context.getBean("bus");
      System.out.println(b);
      //calls destroy method.
      context.registerShutdownHook();
      
      Pepsi p = (Pepsi)context.getBean("pepsi");
      System.out.println(p);
      
      Books bk = (Books)context.getBean("book");
      System.out.println(bk);
	}

}
