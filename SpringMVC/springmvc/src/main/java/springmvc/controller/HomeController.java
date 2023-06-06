package springmvc.controller;





import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home( Model model)
	{
		System.out.println("This is home URL");
		
		model.addAttribute("name","Mandeep singh" );
		model.addAttribute("id", 001);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Roshni");
		friends.add("ABC");
		friends.add("Uttam");

		model.addAttribute("f", friends);
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about controller ");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services()
	{
		System.out.println("This is service Controller ");
		return "services";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help Controller ");
		
		ModelAndView modelAndView=new ModelAndView();
		//setting data
		modelAndView.addObject("Name", "Mandeep Singh");
		modelAndView.addObject("id", 125);
		LocalDateTime now =	LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		//Setting the View page
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
