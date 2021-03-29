package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageRedirectController {
	@RequestMapping("/homePage")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/inputData")
	public String inputPage() {
		return "inputData";
	}
	
	@RequestMapping("/showResult")
	public String showResult(@RequestParam(value = "title", required=false, defaultValue = "Only show default value here!")String title, Model model) {
		model.addAttribute("name", title);
		return "showResult";
	}
}
