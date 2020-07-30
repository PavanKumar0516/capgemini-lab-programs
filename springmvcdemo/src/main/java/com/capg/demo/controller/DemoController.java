package com.capg.demo.controller;
import java.time.LocalDate;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	public DemoController() {
		System.out.println("Bean Created For Demo Controller");
	}
	
//	@GetMapping("/message")
//	public String getMessage(Model m) {
//		m.addAttribute("msg","Hello Sir...");
//		m.addAttribute("date", LocalDate.now());
//		return "show";
//	}
	
	@GetMapping("/message")
	public ModelAndView getMessage() {
		ModelAndView mv=new ModelAndView("show");
		mv.addObject("msg","Hello Sir...");
		mv.addObject("date", LocalDate.now());
		return mv;
			}
	
	
}