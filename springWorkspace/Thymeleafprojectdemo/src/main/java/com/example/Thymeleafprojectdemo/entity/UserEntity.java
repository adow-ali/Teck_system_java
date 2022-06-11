package com.example.Thymeleafprojectdemo.entity;

//import javax.persistence.Entity;

//@Entity
public class UserEntity {
	//Creating our fields
    private String name;
    private String email;
    //creating our args constructors
    public UserEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }
// default constructor
    public UserEntity() {
    }
// Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
