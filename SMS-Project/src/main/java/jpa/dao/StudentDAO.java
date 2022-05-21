package jpa.dao;

import java.sql.SQLException;
import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	List<Student> getAllStudents() throws ClassNotFoundException, SQLException;

	Student getStudentByEmail(String sEmail) throws ClassNotFoundException, SQLException;

	boolean validateStudent(String sEmail, String sPassword) throws ClassNotFoundException, SQLException;

	Student registerStudentToCourse(Student st, int cId) throws ClassNotFoundException, SQLException;

	List<Course> getStudentCourses(String sEmail) throws ClassNotFoundException, SQLException;

}
