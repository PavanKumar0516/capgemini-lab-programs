package com.capg.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.movie.DAO.MovieCatelogRepo;
import com.capg.movie.model.MovieCatelog;

@Service
public class MovieCatelogService {
	@Autowired
	private MovieCatelogRepo repo;
	
	public MovieCatelog addCatelog(MovieCatelog catelog) {
		return repo.save(catelog);
		
	}
	public MovieCatelog getCatelog(int id) {
		return repo.getOne(id);
		
	}

}
