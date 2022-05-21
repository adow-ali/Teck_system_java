package jpa.mainrunner;

import java.sql.SQLException;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {
	private Scanner sin;
	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;

	public SMSRunner() {
		sin = new Scanner(System.in);
		courseService = new CourseService();
		studentService = new StudentService();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SMSRunner sms = new SMSRunner();
		sms.run();
	}

	private void run() throws ClassNotFoundException, SQLException {
		switch (menu1()) {
		case 1:
			if (studentLogin()) {
				registerMenu();
			}
			break;

		case 2:
			System.out.println("Bye!");
			break;

		default:
			System.out.println("Your input is wrong! \nBye!");
		}
	}

	private int menu1() {
		System.out.println("\n1. Student Login\n2. Quit Application\nPlease Enter Selection: ");
		return sin.nextInt();
	}

	private boolean studentLogin() throws ClassNotFoundException, SQLException {
		boolean returnValue = false;
		try {
			System.out.println("Enter Your Email Address: ");
			String email = sin.next();
			System.out.println("Enter Your Password: ");
			String password = sin.next();

			if (studentService.validateStudent(email, password)) {
				currentStudent = studentService.getStudentByEmail(email);
				List<Course> crs = currentStudent.getsCourses();

				System.out.println("MyClasses");
				System.out.format("%10s-30s%-30s%-30s\n", "Id", "Course", "Instructor");
				for (Course cr : crs) {
					System.out.format("%-10s%-30s%-30s", cr.getscId(), cr.getcName(), cr.getcInstructorName());
				}
				registerMenu();

			}
		} catch (Exception e) {
			System.out.println(" User validation failed. Good Bye!");
		}

		return returnValue;
	}

	private void registerMenu() throws ClassNotFoundException, SQLException {
		System.out.println("\n.register a class\n2. Logout\nPlease Enter Selection: ");
		switch (sin.nextInt()) {
		case 1:

			List<Course> allCourses = courseService.getAllCourses();
			System.out.format("%-10s%-30S%-30s\n", "ID", "Course", "Instructor");
			for (Course course : allCourses) {
				System.out.format("%-10s%-30S%-30s\n", String.valueOf(course.getClass()), course.getcName(),
						course.getcInstructorName());
			}

			System.out.println();
			System.out.println("Enter Course Number: ");

			int number = sin.nextInt();

			currentStudent = studentService.registerStudentToCourse(currentStudent, number);

			List<Course> crs = currentStudent.getsCourses();

			System.out.println("MyClasses");
			System.out.format("%-10s%-30S%-30s\n", "ID", "Course", "Instructor");
			for (Course course : crs)
			{
				System.out.format("%-10s%-30S%-30s\n", String.valueOf(course.getClass()), ((Course) course).getcName(), course.getcInstructorName());
			}
				
			registerMenu();
			break;

		case 2:
			System.out.println("Log Out Completed");

			menu1();
			break;

		default:

			System.out.println("Good Bye! ");

		}
	}

}
