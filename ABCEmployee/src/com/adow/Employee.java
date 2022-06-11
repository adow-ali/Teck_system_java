package com.adow;

public class Employee extends EmployeeAnalysis {

	private String name;
	private int id;
	private String city;

	// Contructor - build objects using this constructor

	public Employee() {

		this.name = "";
		this.id = 0;
		this.city = "";

	}

	public Employee(String name, int id, String city) {
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display() {
		System.out.println(" Name: " + getName() + " ID: " + getId() + " City: " + getCity());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

	@Override
	public void displayAnalysis() {
		System.out.println("XYZ Analysis Report");

	}

	@Override
	public void writeDoc() {
		System.out.println("XYZ Analysis Report");
		displayXYZHeading();

	}

}
