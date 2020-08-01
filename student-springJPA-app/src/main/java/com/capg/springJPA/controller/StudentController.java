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

import com.capg.springJPA.model.Student;
import com.capg.springJPA.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s1) {
		return service.addStudent(s1);
	}
	
	@GetMapping("/student/id/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudent(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@DeleteMapping("/student/id/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student s1) {
		return service.updateStudent(s1);
	}

}
