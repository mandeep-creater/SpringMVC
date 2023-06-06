package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfiguration {
	
	public Samosa getsamosa()
	{
		Samosa samosa = new Samosa();
		return samosa;
	}
	
	@Bean
	public Student getStudent()
	{
		// creating new Student object
		
		Student student = new Student(getsamosa());
		
		return student;
	}
}
