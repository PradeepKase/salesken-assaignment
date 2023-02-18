package com.masai.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Semester {
	private int id;
	
	private int english;
	
	private int maths;
	
	private int science;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public Semester() {
		// TODO Auto-generated constructor stub
	}
	
	public Semester(int id, int english, int maths, int science) {
		super();
		this.id = id;
		this.english = english;
		this.maths = maths;
		this.science = science;
	}
	
	
	
}
