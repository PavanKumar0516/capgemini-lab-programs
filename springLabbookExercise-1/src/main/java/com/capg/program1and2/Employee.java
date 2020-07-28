package com.capg.program1and2;

public class Employee {
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", busiessUnit=" + busiessUnit + "]";
	}
	private int employeeId;
	private String employeeName;
	private double salary;
	private Sbu busiessUnit;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Sbu getBusiessUnit() {
		return busiessUnit;
	}
	public void setBusiessUnit(Sbu busiessUnit) {
		this.busiessUnit = busiessUnit;
	}

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, double salary, Sbu busiessUnit) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.busiessUnit = busiessUnit;
	}
	public Sbu getSbuDetails()
	{
		return busiessUnit;
	}
	
}