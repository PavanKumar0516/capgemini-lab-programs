package com.cg.eis.exception;

public class EmpSalary {
	public int salary(double sal) {
		int flag=0;
		if(sal<3000) {
			throw new EmployeeException("salary is lessthan 3000...");
		}
		else {
			flag=1;
		}
		return flag;
		
	}

}
