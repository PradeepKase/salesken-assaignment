package com.masai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rollNumber;
	@NotNull
	@Size(min = 3, max = 20, message = "min 3 and max 20 characters")
	private String name;
	@NotNull
	@Size(max = 35)
	private String gender;
	@NotNull
	private String address;
	@Email
	private String email;
	
	
	@ElementCollection
	private List<Semester> semesters=new ArrayList<>();

	
	
	

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Semester> getSemesters() {
		return semesters;
	}

	public void setSemesters(List<Semester> semesters) {
		this.semesters = semesters;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer rollNumber, String name, String gender, String address, String email) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.email = email;
	}
	
	
	
}
