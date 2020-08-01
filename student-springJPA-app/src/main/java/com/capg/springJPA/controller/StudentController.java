package com.capg.springJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springJPA.exception.StudentAgeException;
import com.capg.springJPA.exception.StudentAlreadyExists;
import com.capg.springJPA.exception.StudentNotFoundException;
import com.capg.springJPA.model.Students;
import com.capg.springJPA.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public Students addStudent(@RequestBody Students s1)throws StudentAlreadyExists, StudentAgeException  {
		return service.addStudent(s1);
	}
	
	@GetMapping("/student/id/{id}")
	public Students getStudent(@PathVariable int id)throws StudentNotFoundException {
		return service.getStudent(id);
	}
	
	@GetMapping("/students")
	public List<Students> getAllStudents(){
		return service.getAllStudents();
	}
	
	@DeleteMapping("/student/id/{id}")
	public void deleteStudent(@PathVariable int id)throws StudentNotFoundException {
		service.deleteStudent(id);
	}
	
	@PutMapping("/student")
	public Students updateStudent(@RequestBody Students s1)throws StudentNotFoundException {
		return service.updateStudent(s1);
	}

}
