package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;





// ModelAttribute Method 
@Controller
public class Contact {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void CommonDataForModel(Model m)
	{
		m.addAttribute("Header", "Coding Registration form");
		m.addAttribute("Desc","Home for Programmers");
		System.out.println("Adding Common data to Model...");
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		//m.addAttribute("Header", "Coding Registration form");
	//	m.addAttribute("Desc","Home for Programmers");
		System.out.println("Creating form....");
		return"contact";
	}
	
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute  User user,  Model model)
	{
		System.out.println(user);
		//model.addAttribute("Header", "Coding Registration form");
		//model.addAttribute("Desc","Home for Programmers");
		
	//	model.addAttribute("User", user);
		
		if(user.getName().isBlank())
		{
			return "redirect:/contact";
		}
		 int createdUser= this.userService.createUser(user);
		 model.addAttribute("msg","User Created with id : "+createdUser);
		//System.out.println("user created");
		
		return "success";
	}
	
}


//***************************************************************************************
//RequestParam method

/*
 * 
 * 
 * 
 * package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Contact {
	@RequestMapping("/contact")
	public String showForm()
	{
		return"contact";
	}
	
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm
						  (  
						     @RequestParam("Email") String UserEmail , 
			                 @RequestParam("Name")String UserName ,
			                 @RequestParam("Password") String UserPassword,
			                 Model model
						  )
	{
		System.out.println(" User Email "+UserEmail);
		System.out.println(" User Name "+UserName);
		System.out.println(" User Password "+UserPassword);
		
		model.addAttribute("Email", UserEmail);
		model.addAttribute("Name",UserName);
		model.addAttribute("Password", UserPassword);
		
		return "success";
	}
}
*/
 
