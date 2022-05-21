package jpa.entitymodels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	private String sEmail;
	private String sName;
	private String sPass;
	private List<Course> sCourses;

	public Student() {
		sCourses = new ArrayList<>();
		sCourses.add(new Course("English", "Andrea Scamaden"));
	}

	public Student(String sEmail, String sName, String spass, List<Course> sCourses) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = spass;
		this.sCourses = sCourses;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getSpass() {
		return sPass;
	}

	public void setSpass(String sPass) {
		sPass = sPass;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	public Object getsPass() {
		// TODO Auto-generated method stub
		return null;
	}

}
