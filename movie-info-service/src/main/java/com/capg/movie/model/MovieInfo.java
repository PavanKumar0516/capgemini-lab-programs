package com.capg.movie.model;

public class MovieInfo {
	private int id;
	private String movieName;
	private double rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public MovieInfo(int id, String movieName, double rating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.rating = rating;
	}
	public MovieInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
