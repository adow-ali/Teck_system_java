package jpa.dao;

import java.sql.SQLException;
import java.util.List;

import jpa.entitymodels.Course;

public interface CourseDAO {
	List<Course> getAllCourses() throws ClassNotFoundException, SQLException;
}