package com.example.entity;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Setter
//@Getter
//@ToString
//@AllArgsConstructor
//@EqualsAndHashCode
@Data
@Entity
public class StudentEntity {
	
	//setting our fields
	private String rollNo;
	private String name;
	
//	 getters and setters--- used Lombok instead for this project
	public String getRollup() {
		return rollNo;
	}
	public void setRollup(String rollup) {
		this.rollNo = rollup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}



