package com.adow;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee myEmp = new Employee("Adow", 1, "St.Cloud");
		myEmp.display();
	
		
		myEmp.writeDoc();
		myEmp.displayAnalysis();
	}

}
