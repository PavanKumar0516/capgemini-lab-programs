package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.capg.model.Trainee;

@Controller
public class TraineeController {

	@Autowired
	RestTemplate rt;

	@PostMapping("/addTrainee")
	public String addTrainee(@ModelAttribute Trainee trainee, Model m) {
		Trainee tr = rt.postForObject("http://localhost:8888/trainee", trainee, Trainee.class);
		m.addAttribute("trainee", tr);
		return "success.jsp";
	}

}
