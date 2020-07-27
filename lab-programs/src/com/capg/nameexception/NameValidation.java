package com.capg.nameexception;

public class NameValidation {
	
	public int EmployeeName(String firstName, String lastName) {
		int flag=0;
		if(firstName.length()<=0 || lastName.length()<=0) {
			throw new InvalidNameException("Please enter valid name");
		}
		else {
			flag=1;
		}
		return flag;
		
	}

}
