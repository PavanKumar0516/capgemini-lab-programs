package com.capg.movie.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.movie.model.MovieCatelog;

public interface MovieCatelogRepo extends JpaRepository<MovieCatelog, Integer> {

}
