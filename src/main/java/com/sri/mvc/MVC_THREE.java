package com.sri.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class MVC_THREE {
	public MVC_THREE() {
		System.out.println("created third");
	}
	@RequestMapping("/uploadFile.do")
	public String justmess(HttpServletRequest req) {
		System.out.println("invoked just method");
		String name =req.getParameter("name");
		System.out.println("name is"+name);
		String file =req.getParameter("file");
		System.out.println("file is"+file);
		return "/index.jsp";
		
	}
	
	
	
}
