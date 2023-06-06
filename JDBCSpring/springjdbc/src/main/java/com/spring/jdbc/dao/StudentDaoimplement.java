package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;
@Component("StudentDao")
public class StudentDaoimplement implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		 String query ="insert into student(id,name,city) values(?,?,?)";
		 int r = this.jdbcTemplate.update(query,student.getId(), student.getName(),student.getCity());
		 
		return r;
	}
	
	public int change(Student student) {
		// TODO Auto-generated method stub
		
		String query = "update student  set name=? , city=? where id=?";
		int r =this.jdbcTemplate.update(query, student.getName() , student.getCity(),student.getId() );
		
		return r;
	}

	public int delete(int studentId) {
		// TODO Auto-generated method stub
		
		String query="delete from student where id =?";
		int r= this.jdbcTemplate.update(query,studentId);
		return r;
	}

	public Student getStudent(int studentId) {
		// TODO Auto-generated method student
		String query="Select * from student where id=?";
		
		Student student= this.jdbcTemplate.queryForObject(query , new RowMapper<Student>(){

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				
				return student;
			}	
		} , studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query="Select * from student";
		
		List<Student> students= (List<Student>) this.jdbcTemplate.query(query,new RowMapperimpl() );
		return students;
	}

	
 
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

}
