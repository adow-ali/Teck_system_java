package com.myNewCompany;

public class Manager extends Employee{

	public Manager(long Id, String Name, String Address, long Phone, double salary) {
		super(Id, Name, Address, Phone);
		this.basicSalary = salary;
	
	}
	public double calculateTransportAllowance(){  
    	
 	   double transportAllowance = 15*basicSalary /100;
 	   return transportAllowance; 

}
	
}