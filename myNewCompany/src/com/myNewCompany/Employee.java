package com.myNewCompany;

public class Employee {
	
		private long employeeId;
		private String employeeName;
		private String employeeAddress;
		private long employeePhone;
		public double basicSalary;
		private double specialAllowance = 250.80;
		private double Hra = 1000.50;
		
		public Employee(long empployeeId, String employeeName, String employeeAddress, long employeePhone,
				double basicSalary, double specialAllowance, double hra) {
			super();
			
			this.employeeId = empployeeId;
			this.employeeName = employeeName;
			this.employeeAddress = employeeAddress;
			this.employeePhone = employeePhone;
			this.basicSalary = basicSalary;
			this.specialAllowance = specialAllowance;
			Hra = hra;
		}
		
		
	public Employee(long Id, String Name, String Address, long Phone
				) {
			super();
			Id = employeeId;
			Name = employeeName;
			Address = employeeAddress;
			Phone = employeePhone;
		
			
		}

		public double calculateSalary() {
			double salary = basicSalary +(basicSalary * specialAllowance/100) +(basicSalary*Hra/100);
				return salary;
		}
       public double calculateTransportAllowance(){  
    	
    	   double transportAllowance = basicSalary* 10/100;
    	   return transportAllowance;
       }
		
	}


