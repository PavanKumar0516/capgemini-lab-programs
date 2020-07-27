package com.capg.age;

import java.util.Scanner;

public class EmpAge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in );
		System.out.println("enter age:");
		int age=scan.nextInt();
		AgeValidation obj=new AgeValidation();
		try {
			int flag=obj.isValidAge(age);
			if(flag==1) {
				System.out.println("age is valid");
			}
		}catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}

}
