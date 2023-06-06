package springmvcsearch.entity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is preHandler");
		
		String name=request.getParameter("user");
		if(name.startsWith("d"))
		{
			response.setContentType("text/Html");
			response.getWriter().println("<h1>Invalid name..Name should not start eith d");
			return false;
			
		}
		return true;
	}

	
	
}
