package jpa.service;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import org.hibernate.HibernateException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentDAO {

   EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");

   

    @Override
    public List<Student> getAllStudents(){
        List<Student> allStudents = null;
        EntityManager entityManager = emf.createEntityManager();
        Query query = entityManager.createNamedQuery("SELECT  * FROM Course c ");
        allStudents = query.getResultList();
        entityManager.close();
        return allStudents;
    }

    public  Student getStudentByEmail(String sEmail){
        Student student = null;
        EntityManager em = emf.createEntityManager();
        try {
            Query query = em.createQuery("from Student s WHERE s.sEmail = :email ");
            query.setParameter("email", sEmail);
            student = (Student) query.getSingleResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            //close em
            if (em != null && em.isOpen()) {
                em.close();
            }
        }
        return student;
    }

   
    public boolean validateStudent(String sEmail, String sPassword) {
        Student student = getStudentByEmail(sEmail);
        if (student != null) {
            return student.getsPass().equals(sPassword);
        }
        return false;
    }


    public void registerStudentToCourse(String sEmail, int cID){
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            // find student object by Email
            Student student = entityManager.find(Student.class, sEmail);

            //get all courses related to student
            List<Course> allCourses = getStudentCourses(sEmail);

            //  all courses
            List<Course> courseList = new ArrayList<Course>();
            courseList.addAll(allCourses);

            //adding new course to the course list
            courseList.add(new CourseService().getCourseById(cID));

            //persist to database
            if (courseList.size() > 0) {
                student.setsCourses(courseList);
                entityManager.persist(student);
            }
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    /*This method takes a Student’s Email as a parameter and would find all the courses a student is registered.*/
    @Override
    public List<Course>  getStudentCourses(String sEmail){
        List<Course> allCourses = null;
        EntityManager entityManager = emf.createEntityManager();
        try {
            Query query = entityManager.createNativeQuery("Select c.* from Course c JOIN student_course sc on c.id = sc.course_id WHERE sc.student_email = :email", Course.class);
            query.setParameter("email", sEmail);
            allCourses = query.getResultList();
        } catch (Exception e) {

        } finally {
            entityManager.close();
        }
        return allCourses;
    }

	@Override
	public Student registerStudentToCourse(Student st, int cId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}