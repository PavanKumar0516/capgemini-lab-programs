package com.capg.movie.model;

public class MovieRating {
	
	private int id;
	private double rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public MovieRating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieRating(int id, double rating) {
		super();
		this.id = id;
		this.rating = rating;
	}
	

}
