package com.yna.dwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YnaDwlController {

	// http://localhost:8000/dwl/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("tempHome()");
		return "/home.html";
	}
	
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		return "/test";
	}		
	
	@GetMapping("/hp")
	public String downHP() {
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		return "/HP_Download";
	}	
	
}
