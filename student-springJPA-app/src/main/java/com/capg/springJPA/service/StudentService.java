package com.capg.springJPA.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springJPA.exception.StudentAgeException;
import com.capg.springJPA.exception.StudentAlreadyExists;
import com.capg.springJPA.exception.StudentNotFoundException;
import com.capg.springJPA.model.Students;
import com.capg.springJPA.repo.StudentJPArepo;

@Service
public class StudentService {

	@Autowired
	StudentJPArepo dataJpaRepo;

	public Students addStudent(Students s1) throws StudentAlreadyExists, StudentAgeException {
		LocalDate date1 = LocalDate.now();
		Period intervalPeriod = Period.between(s1.getDob(), date1);

		if (intervalPeriod.getYears() < 18) {
			throw new StudentAgeException("Age should be greater than 18");
		}
		boolean s = dataJpaRepo.existsById(s1.getStudentId());
		if (s) {
			throw new StudentAlreadyExists("Student already exists please enter valid id");
		}

		return dataJpaRepo.save(s1);
	}

	public Students getStudent(int id) throws StudentNotFoundException {
		if (dataJpaRepo.getOne(id) == null) {
			throw new StudentNotFoundException("Student with id " + id + " doesnot exist");
		}
		return dataJpaRepo.getOne(id);
	}

	public List<Students> getAllStudents() {
		return dataJpaRepo.findAll();
	}

	public void deleteStudent(int id) throws StudentNotFoundException {
		if (dataJpaRepo.existsById(id)) {
			dataJpaRepo.deleteById(id);
		} else {
			throw new StudentNotFoundException("Student doesnot exist");
		}
	}

	public Students updateStudent(Students student) throws StudentNotFoundException {

		if (dataJpaRepo.existsById(student.getStudentId())) {
			Students s = dataJpaRepo.getOne(student.getStudentId());
			s.setDob(student.getDob());
			s.setStudentName(student.getStudentName());
			return dataJpaRepo.save(s);
		} else {
			throw new StudentNotFoundException("Student doesnot exist");
		}
	}
}