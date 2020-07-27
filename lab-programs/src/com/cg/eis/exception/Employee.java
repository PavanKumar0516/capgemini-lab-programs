package com.cg.eis.exception;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee salary:");
		double salary=scan.nextDouble();
		EmpSalary obj=new EmpSalary();
		try {
			int flag=obj.salary(salary);
			if(flag==1) {
				System.out.println("Employee salary is : "+salary);
			}
		}catch (EmployeeException e) {
			System.err.println(e.getMessage());
		}
	}

}
