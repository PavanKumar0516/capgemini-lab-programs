package com.capg.movie.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.movie.model.MovieRating;

public interface MovieRatingRepo extends JpaRepository<MovieRating, Integer> {

}
