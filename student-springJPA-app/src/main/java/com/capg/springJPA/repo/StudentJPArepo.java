package com.capg.springJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springJPA.model.Student;

public interface StudentJPArepo extends JpaRepository<Student, Integer> {

}
