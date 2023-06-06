package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	//	Samosa S = (Samosa) context.getBean("samosa_1");
	 //   System.out.println(S);
		context.registerShutdownHook();
	//	Pepsi p = (Pepsi) context.getBean("pepsi_1");
	//	System.out.println(p);
		Example E = (Example) context.getBean("subject_1");
		System.out.println(E);

	}

}
