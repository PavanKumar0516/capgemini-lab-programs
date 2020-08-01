package com.capg.springboot.traineecontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.springboot.trainee.Trainee;
import com.capg.springboot.traineeservice.ITraineeService;
@Controller
@RequestMapping("/trainee")
public class TraineeController {
	@Autowired 
	ITraineeService service;
	
	@PostMapping("/add")
	public String addTrainee( @ModelAttribute Trainee t1, Model m ) {
		service.addTrainee(t1);
		m.addAttribute("trainee",t1);
		return "Trainee added sucessfully";
	}
	@PutMapping("/update")
	public String updateTrainee(@ModelAttribute Trainee t1, Model m ) {
		service.addTrainee(t1);
		m.addAttribute("trainee",t1);
		return "Trainee updated sucessfully";
	}
	@GetMapping("/select")
	public String selectTrainee(@RequestParam("tId") int tId, Model m){
		Optional<Trainee> t1=service.selectTrainee(tId);
		m.addAttribute("trainee", t1);
		return "show";
	}
	@DeleteMapping("/delete/{tid}")
	public String deleteTrainee(@PathVariable ("tid") int tid) {
		service.deleteTrainee(tid);
		return "Trainee deleted sucessfully";
	}

}
