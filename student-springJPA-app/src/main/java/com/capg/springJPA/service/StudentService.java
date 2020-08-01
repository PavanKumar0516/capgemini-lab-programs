package com.capg.springJPA.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springJPA.model.Student;
import com.capg.springJPA.repo.StudentJPArepo;

@Service
public class StudentService {

	@Autowired
	StudentJPArepo dataJpaRepo;

	@Transactional
	public Student addStudent(Student s1) {

		if (dataJpaRepo.existsById(s1.getStudentId())) {
			throw new RuntimeException("student Already Exists");
		}
		return dataJpaRepo.save(s1);
	}

	@Transactional
	public Student getStudent(int studentId) {

		return dataJpaRepo.getOne(studentId);
	}

	@Transactional
	public List<Student> getAllStudents() {
		return dataJpaRepo.findAll();

	}

	@Transactional
	public void deleteStudent(int StudentId) {

		dataJpaRepo.deleteById(StudentId);
	}

	public Student updateStudent(Student s1) {
		Student s2 = dataJpaRepo.getOne(s1.getStudentId());
		s2.setStudentName(s1.getStudentName());
		s2.setDob(s1.getDob());
		return dataJpaRepo.save(s2);

	}

}
