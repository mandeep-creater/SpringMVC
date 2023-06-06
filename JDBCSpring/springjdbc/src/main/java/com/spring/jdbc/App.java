package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoimplement;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program started.........");
		// spring jdbc=> JdbcTemplate
		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcconfig.class);

		StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);
	//	INSERT
	//Student student = new Student();
	//	student.setId(102);
	//student.setName("roma");
	//	student.setCity("London");

	//	int result = studentDao.insert(student);
//
	//System.out.println("student added " + result);
		// UPDATE
//		Student student=new Student();
//		student.setId(245);
//		student.setName("Raj Kumar");
//		student.setCity("Lucknow");
//		int result = studentDao.change(student);
//		System.out.println("data changed "+result);

		// DELETE
//		int result = studentDao.delete(245);
//		System.out.println("deleted "+result);
//		

	//	Student student = studentDao.getStudent(101);
		//System.out.println(student);
//

		List<Student> students=studentDao.getAllStudents();
		for(Student s:students)
		{
			System.out.println(s);
		}
		
		  
		  }
		 
}
