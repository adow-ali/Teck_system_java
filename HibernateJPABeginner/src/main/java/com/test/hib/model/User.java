package com.project.hib.model;

public class User {
	package com.test.hib.model;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name = "USER")
	public class User {
		    private Integer id;
		    private String fullname;
		    private String email;
		    private String password;
		    private int age;
		    private double salary;
		    private String city;
		        
		    public User(String fullname, String email, String password, int age, double salary, String city) {
				this.id = id;
				this.fullname = fullname;
				this.email = email;
				this.password = password;
				this.age = age;
				this.salary = salary;
				this.city = city;
			}
		    	    public User() {
				
			}
	          @Column(name = "USER_ID")
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    public Integer getId() {
		        return id;
		    }
			public void setId(Integer id) {
		        this.id = id;
		    }
		 
		    public String getFullname() {
		        return fullname;
		    }
		 
		    public void setFullname(String fullname) {
		        this.fullname = fullname;
		    }
		 
		    public String getEmail() {
		        return email;
		    }
		 
		    public void setEmail(String email) {
		        this.email = email;
		    }
		 
		    public String getPassword() {
		        return password;
		    }
		 
		    public void setPassword(String password) {
		        this.password = password;
		    }
		    
		    public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public double getSalary() {
				return salary;
			}

			public void setSalary(double salary) {
				this.salary = salary;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}
	}


}