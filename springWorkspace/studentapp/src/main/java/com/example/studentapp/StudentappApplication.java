package com.example.studentapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.controller.StudentController;
import com.example.entity.StudentEntity;
import com.example.service.StudentView;
//@SpringBootApplication
public class StudentappApplication {
	public static void main(String[] args) {
//		SpringApplication.run(StudentappApplication.class, args);
		
		StudentEntity model = retrieveStudent();
		
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view );
		
		//First call
		controller.updateView();
		
		
		// update model
		controller.setStudentName("Ali");
	    controller.setStudentRollNo("20");
		
		// Second call
		controller.updateView();
	}
	public static StudentEntity retrieveStudent() {
		StudentEntity student = new StudentEntity();
		student.setName("Ali");
		student.setRollup("15");
		
		return student;
	}
}








