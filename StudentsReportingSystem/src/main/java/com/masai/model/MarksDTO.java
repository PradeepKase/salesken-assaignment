package com.masai.model;

public class MarksDTO {

	private Integer english;
	
	private Integer maths;
	
	private Integer science;
	
	private Double averagePercentile;

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	public Integer getScience() {
		return science;
	}

	public void setScience(Integer science) {
		this.science = science;
	}

	public Double getAveragePercentile() {
		return averagePercentile;
	}

	public void setAveragePercentile(Double averagePercentile) {
		this.averagePercentile = averagePercentile;
	}
	
	
	public MarksDTO() {
		// TODO Auto-generated constructor stub
	}

	public MarksDTO(Integer english, Integer maths, Integer science, Double averagePercentile) {
		super();
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.averagePercentile = averagePercentile;
	}
	
	
	
}
