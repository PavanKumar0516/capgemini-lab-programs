package com.capg.age;

public class AgeValidation {
	public int isValidAge(int age) {
		int flag;
		if(age<=15) {
			throw new InvalidAgeException("please enter valid age");
		}else {
			flag=1;
		}
		return flag;
		
	}

}
