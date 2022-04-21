package com.myNewCompany;

public class InheritanceActivity {

	public static void main(String[] args) {
	Manager manager = new Manager (126534, "Peter", "Chennai India", 237844, 65000);
    double salaryAmount =manager.calculateSalary();
    System.out.println(salaryAmount);
    Trainee trainee = new Trainee (29846, "Jack",  "Mumbai", 442085,45000);
    double salary = trainee.calculateSalary();
    System.out.println(salary);
    double allowanceForManager = manager.calculateTransportAllowance();
	 System.out.println(allowanceForManager);
	 
	 double allowanceForTrainee = trainee.calculateTransportAllowance();
	 System.out.println(allowanceForTrainee);		
	}
	

}
