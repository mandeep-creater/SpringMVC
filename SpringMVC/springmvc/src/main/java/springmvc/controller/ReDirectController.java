package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectController {
	//when we use Redirect View
	
	/* @RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("This is One Handler ");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	*/
	
	//when we use Redirect prefix
	@RequestMapping("/one")
	public String one()
	{
		System.out.println("This is One Handler ");
		return"redirect:/enjoy";
	}
	
	
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("This is second  Handler ");
		return"contact";
	}
}
