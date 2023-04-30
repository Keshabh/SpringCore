package com.springcore.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//here we dont use config xml files, instead there is a class which uses configuration annotation.

@Configuration
@ComponentScan(basePackages = "com.springcore.JavaConfig")
public class JavaConfig {
	
	
	@Bean({"mg1","mg2","mg3"})
	public Manager getManager()
	{
		Manager manager = new Manager();
		return manager;
	}

}
