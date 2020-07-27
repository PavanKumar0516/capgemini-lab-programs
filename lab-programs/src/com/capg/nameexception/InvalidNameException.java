package com.capg.nameexception;

public class InvalidNameException extends RuntimeException {
	private static final long serialVersionUID = 2841120674639391894L;
	public InvalidNameException(String message) {
		super(message);
	}
  
}
