package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.entity.StudentEntity;

@Controller
public class Form_Contoller {
	
	@RequestMapping("/complex")
	public String complex_form()
	{
		System.out.println("opening the Complex form...");
		return"complex_form";
	}
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String handelfrom(@ModelAttribute("student") StudentEntity student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return"complex_form";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return"success";
	}

}
