package com.capg.program3;

import java.util.ArrayList;

public class Sbu {
		private int sbuCode;
		private String sbuName;
		private String subHead;
		private ArrayList<Employee> empList;

		public int getSbuCode() {
			return sbuCode;
		}

		public void setSbuCode(int sbuCode) {
			this.sbuCode = sbuCode;
		}

		public String getSbuName() {
			return sbuName;
		}

		public void setSbuName(String sbuName) {
			this.sbuName = sbuName;
		}

		public String getSubHead() {
			return subHead;
		}

		public void setSubHead(String subHead) {
			this.subHead = subHead;
		}

		public ArrayList<Employee> getEmpList() {
			return empList;
		}

		public void setEmpList(ArrayList<Employee> empList) {
			this.empList = empList;
		}

		@Override
		public String toString() {
			return "Sbu [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", subHead=" + subHead + ", empList=" + empList
					+ "]";
		
	}

}
