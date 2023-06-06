package com.springcore.auto.wireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wireannotation/autoconfig.xml");
		Emp E=(Emp) context.getBean("Emp_1");
		System.out.println(E);
		
	}

}
