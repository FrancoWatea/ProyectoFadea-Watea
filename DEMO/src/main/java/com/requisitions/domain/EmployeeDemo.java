package com.requisitions.domain;

public class EmployeeDemo {

	 private String empName;
	    private String empAge;
	    
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpAge() {
			return empAge;
		}
		public void setEmpAge(String empAge) {
			this.empAge = empAge;
		}
		
		@Override
		public String toString() {
			return "EmployeeDemo [empName=" + empName + ", empAge=" + empAge + "]";
		}

	 
}
