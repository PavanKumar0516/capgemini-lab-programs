package com.capg.springJPA.exception;

public class StudentNotFoundException extends Exception {
	public StudentNotFoundException(String message)
	{
		super(message);
	}
}
