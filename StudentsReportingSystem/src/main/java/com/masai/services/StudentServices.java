package com.masai.services;

import java.util.List;

import com.masai.model.MarksDTO;
import com.masai.model.Semester;
import com.masai.model.Student;

public interface StudentServices {

	public Student createStudent(Student student);
	
	public MarksDTO averageReports(Integer semesterId);
	
	public void setMarks(Integer studentId,Semester semester);
	
	public List<Student> topTwoStudents();
}
