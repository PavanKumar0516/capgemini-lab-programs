package com.capg.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieCatelog {
	@Id
	private int id;
	private String movieName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRating() {
		return movieName;
	}
	public void setRating(String movieName) {
		this.movieName = movieName;
	}
	public MovieCatelog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieCatelog(int id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}
	
	

}
