package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	//save
	@Transactional
	public int insert(Student student)
	{
		//insert
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	
	// get a single data
	public Student getStudent(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	
	// get multiple data 
	public List<Student> getAllStudent()
	{
		List<Student>students= this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	
	// delete data
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student student = this .hibernateTemplate.get(Student.class, studentId);
		this .hibernateTemplate.delete(student);
	}
	
	
	// update data
	@Transactional
	public int UpdateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
		return 0;
	}
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
