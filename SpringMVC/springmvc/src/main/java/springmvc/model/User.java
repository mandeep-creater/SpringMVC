package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class User {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private String Email;
	private String Name ;
	private String Password;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [Email=" + Email + ", Name=" + Name + ", Password=" + Password + "]";
	}
	
	

}
