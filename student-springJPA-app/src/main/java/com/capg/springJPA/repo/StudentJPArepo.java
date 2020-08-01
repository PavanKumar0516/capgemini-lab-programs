package com.capg.springJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springJPA.model.Students;

public interface StudentJPArepo extends JpaRepository<Students, Integer> {

}
