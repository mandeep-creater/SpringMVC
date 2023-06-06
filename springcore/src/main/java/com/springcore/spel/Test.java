package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		
		Demo d =(Demo) context.getBean("object");
		
		System.out.println(d);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		
		Expression exp = temp.parseExpression("500+500");
		
		System.out.println(exp.getValue());
		
	
	}

}
