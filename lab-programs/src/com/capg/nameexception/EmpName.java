package com.capg.nameexception;

import java.util.Scanner;

public class EmpName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First name:");
		String fName=scan.nextLine();
		System.out.println("Enter last name:");
		String lName=scan.nextLine();
		NameValidation obj=new NameValidation();
		try {
		int flag=obj.EmployeeName(fName, lName);
		if(flag==1) {
			System.out.println("Employee name is "+fName+lName);
		}
		}
		catch (InvalidNameException e) {
			System.err.println(e.getMessage());
		}
			
		}
     
	}


