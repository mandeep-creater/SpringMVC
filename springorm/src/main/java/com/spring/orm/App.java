package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
   ApplicationContext context =	new ClassPathXmlApplicationContext("Config.xml");
   StudentDao studentDao= (StudentDao) context.getBean("studentDao");
   
   //Student student = new Student(111,"Mandeep Singh","Jaipur");
   
  //int r=studentDao.insert(student);
  // System.out.println(" Done "+r);
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   boolean go = true;
  while(go)
  {
	  System.out.println("PRESS 1 for add new Student");
	   System.out.println("PRESS 2 for display all students ");
	   System.out.println("PRESS 3 for get details of single students ");
	   System.out.println("PRESS 4 for delete Students ");
	   System.out.println("PRESS 5 for update Student");
	   System.out.println("PRESS 6 for Exit ");
	   
	   try {
		   int input =Integer.parseInt(br.readLine());
		   
		   switch(input)
		   {
		   case 1:	//add new Student
			   System.out.println("____________________________________");
			   System.out.println("Enter User id: ");
			   int uId =Integer.parseInt(br.readLine());
			   
			   System.out.println("Enter the user name : ");
			   String uName=br.readLine();
			   
			   System.out.println("Enter the user City : ");
			   String uCity=br.readLine();
			   
			   Student s = new Student();
			   s.setStudentId(uId);
			   s.setStudentName(uName);
			   s.setStudentCity(uCity);
			   
			   int r=studentDao.insert(s);
			   System.out.println(r+" Student added");
			   System.out.println("**********************************************");
			   System.out.println();
			   
			   
			   
			   break;
			
		   case 2: //display all Student
			   
			 List<Student> allstudent= studentDao.getAllStudent();
			 System.out.println("____________________________________");
			 	for(Student st : allstudent)
			 	{
			 		System.out.println("Name : "+st.getStudentName());
			 		System.out.println("ID   : "+st.getStudentId());
			 		System.out.println("City : "+st.getStudentCity());
			 		
			 		System.out.println("____________________________________");
			 	}
			 	System.out.println("**********************************************");
			 	
			   break;
			   
		   case 3: //get single student data
			   System.out.println("____________________________________");
			   System.out.println("Enter User id: ");
			   int userId =Integer.parseInt(br.readLine());
			 Student st =  studentDao.getStudent(userId);
			 
			 System.out.println("Name : "+st.getStudentName());
        	 System.out.println("ID : "+st.getStudentId());
		 	 System.out.println("City : "+st.getStudentCity());
		 		
		 	 System.out.println("____________________________________");
			   
			   
			   
			   
			   break;
			   
		   case 4:	//delete Student
			   System.out.println("____________________________________");
			   System.out.println("Enter User id: ");
			   int Id =Integer.parseInt(br.readLine());
			   studentDao.deleteStudent(Id);
			   System.out.println("Student deleted...");
			   
			   break;
			
		   case 5: //update Student
			   System.out.println("____________________________________");
			   System.out.println("Enter the student id to be updated");
				int updatedId = Integer.parseInt(br.readLine());
				
				System.out.println("Press 1 for update the name");
				System.out.println("Press 2 for update the city\n");
				
				System.out.println("Enter your choice for what do you want to update?");
				int choice = Integer.parseInt(br.readLine());
				
				Student std1 = studentDao.getStudent(updatedId);
				
				String updatedName = std1.getStudentName();
				String updatedCity = std1.getStudentCity();
				 System.out.println("____________________________________");
				switch (choice)
				{
				case 1:
					System.out.println("Enter the name to be updated");
					updatedName = br.readLine();
					//setting the student objects value
					std1 = new Student(updatedId, updatedName, updatedCity);
					System.out.println("Name updated successfully");
					break;

				case 2:
					System.out.println("Enter the city name to be updated");
					updatedCity = br.readLine();
					//setting the student objects value in another way
						std1.setStudentId(updatedId);
						std1.setStudentName(updatedName);
						std1.setStudentCity(updatedCity);
					System.out.println("City updated successfully");
					break;
				}
				
				studentDao.UpdateStudent(std1);
				System.out.println("Updated successfully\n");
				
				break;

			   
		   case 6: //Exit
			    go = false;
			   break;
		   }
	   }
  catch(Exception e)
	   {
	  System.out.println(" Invalid Input Try with another one!! ");
	  System.out.println(e.getMessage());
	   }
  
	   System.out.println("Thank you for using this application");
	   System.out.println("See you soon !!");

    }
  }
    
   
}