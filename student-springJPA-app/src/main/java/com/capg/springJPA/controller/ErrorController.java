package com.capg.springJPA.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.springJPA.exception.StudentAgeException;
import com.capg.springJPA.exception.StudentAlreadyExists;
import com.capg.springJPA.exception.StudentNotFoundException;
import com.capg.springJPA.model.ErrorResponse;

@RestControllerAdvice 
public class ErrorController {
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value= {StudentNotFoundException.class})
	public ErrorResponse handleStudentNotFoundException(Exception ex , HttpServletRequest req)
	{
		return new ErrorResponse(new Date(0),ex.getMessage(),HttpStatus.BAD_REQUEST.getReasonPhrase(),HttpStatus.BAD_REQUEST.ordinal(),req.getRequestURI().toString());
	}
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value= {StudentAlreadyExists.class})
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex , HttpServletRequest req)
	{
		return new ErrorResponse(new Date(0),ex.getMessage(),HttpStatus.BAD_REQUEST.getReasonPhrase(),HttpStatus.BAD_REQUEST.ordinal(),req.getRequestURI().toString());
	}
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value= {StudentAgeException.class})
	public ErrorResponse handleStudentAgeException(Exception ex , HttpServletRequest req)
	{
		return new ErrorResponse(new Date(0),ex.getMessage(),HttpStatus.BAD_REQUEST.getReasonPhrase(),HttpStatus.BAD_REQUEST.ordinal(),req.getRequestURI().toString());
	}


}
