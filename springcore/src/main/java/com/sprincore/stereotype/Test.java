package com.sprincore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprincore/stereotype/stereoconfig.xml");
		
		Student S1 = (Student) context.getBean("student");
		
		//System.out.println(S1);
		//System.out.println(S1.getAddress());
		
		
		
	System.out.println(S1.hashCode());
	
	Student S = (Student) context.getBean("student");
	System.out.println(S);

	System.out.println(S.hashCode());
	
	
	

	}

}
