package com.spring_web.sample.spring_web_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String getHomePage() {
		return "index.jsp";
	}
	
	
	@GetMapping("/addition")
	public String getResultPage(HttpServletRequest req, HttpSession session) {
		
		int num1 = Integer.parseInt(req.getParameter("input1"));
		int num2 = Integer.parseInt(req.getParameter("input2"));
		
		session.setAttribute("result", num1 + num2);
		return "result.jsp";
	}

}
