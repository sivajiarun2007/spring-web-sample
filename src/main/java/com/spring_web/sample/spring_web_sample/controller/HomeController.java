package com.spring_web.sample.spring_web_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_web.sample.spring_web_sample.model.Student;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@ModelAttribute("course")
	public String getCourse() {
		return "Java";
	}

	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}

	@GetMapping("/addition")
	public String getResultPage(HttpServletRequest req, HttpSession session) {

		int num1 = Integer.parseInt(req.getParameter("input1"));
		int num2 = Integer.parseInt(req.getParameter("input2"));

		session.setAttribute("result", num1 + num2);
		return "result";
	}

	@GetMapping("/additionRest")
	public String getResultPage(@RequestParam("input3") int num1, @RequestParam("input4") int num2, Model model) {

		model.addAttribute("result", num1 + num2);
		return "result";
	}

	@GetMapping("/getStudent")
	public String getStudent(@ModelAttribute Student student) {

		return "result";
	}

}
