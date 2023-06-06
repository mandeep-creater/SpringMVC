package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {
	@RequestMapping("/user/{userId}")
	public String getUSerDetail(@PathVariable("userId")int userId)
	{
		System.out.println(userId);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Going to home");
		
		String str =null;
		System.out.println(str.length());
		return"home";
	}
	
	

@RequestMapping("/search")
public RedirectView search(@RequestParam("querybox") String query) {

	String url = "https://www.google.com/search?q=" + query;

	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(url);

	return redirectView;
}
//here we can handle all type of exception with Generic type
@ExceptionHandler(value=Exception.class)
public String ExceptionHandlerGeneric(Model m)
{
	m.addAttribute("msg", "Exception has Occured");
	return "null_page";
}
}
