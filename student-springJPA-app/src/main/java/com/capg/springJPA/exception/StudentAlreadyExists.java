package com.capg.springJPA.exception;

public class StudentAlreadyExists extends Exception {
	public StudentAlreadyExists(String message)
	{
	super(message);	
	}
}
