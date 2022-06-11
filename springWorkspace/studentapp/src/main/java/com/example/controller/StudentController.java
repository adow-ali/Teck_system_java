package com.example.controller;
import com.example.entity.StudentEntity;
import com.example.service.StudentView;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class StudentController {
	
	// using our model and view to update and control the data being passed through
	// Dependency injection (ID)
	// Inversion controll (IoC)	
	private StudentEntity model;
	private StudentView view;
	
	// constructor
	public StudentController(StudentEntity model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	//Getters and setters
	public String getStudentName() {
		return model.getName();
	}
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public void setStudentRollNo(String rollNo) {
		model.setRollup(rollNo);
	}
	//use the method from the view to get the update fields
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollup());
	}
	
	
	
}

