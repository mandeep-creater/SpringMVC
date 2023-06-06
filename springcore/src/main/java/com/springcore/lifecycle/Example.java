package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}
	
	@PostConstruct
	public void Start()
	{
		System.out.println("Starting Method Example...");
	}
	@PreDestroy
	
	public void end()
	{
		System.out.println("Endig Method..");
	}
	

}
