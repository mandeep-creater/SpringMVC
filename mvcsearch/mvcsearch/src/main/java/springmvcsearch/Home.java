package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {

	@RequestMapping("/homies")
	public String homies() {
		System.out.println("Sending the Request....");
		return "homies";
	}

//	handling for request
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name,Model m) {
		
		System.out.println("Accepting the Request....");
		System.out.println(name);
		m.addAttribute("name",name);
		return "welcome";
	}

}
	