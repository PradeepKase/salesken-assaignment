package com.masai.servicesImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.MarksDTO;
import com.masai.model.Semester;
import com.masai.model.Student;
import com.masai.repo.StudentREPO;
import com.masai.services.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices{

	@Autowired
	private StudentREPO studentRepo;
	
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		Semester first=new Semester(1, 0, 0, 0);
		Semester second=new Semester(2, 0, 0, 0);
		student.getSemesters().add(first);
		student.getSemesters().add(second);
		return studentRepo.save(student);
	}

	@Override
	public MarksDTO averageReports(Integer semesterId) {
		// TODO Auto-generated method stub
		List<Student>students=studentRepo.findAll();
		int english=0;
		int maths=0;
		int science=0;
		int totalStudents=students.size();
		for(int i=0; i<students.size(); i++) {
				english+=students.get(i).getSemesters().get(semesterId-1).getEnglish();
				maths+=students.get(i).getSemesters().get(semesterId-1).getMaths();
				science+=students.get(i).getSemesters().get(semesterId-1).getScience();
			}
		int totalScoredMarks=english+maths+science;
		int totalMarks=totalStudents*300;
		
		Double percentile=((double)totalScoredMarks/totalMarks)*100;
		
		MarksDTO report=new MarksDTO();
		report.setEnglish((Integer)english/totalStudents);
		report.setMaths((Integer)maths/totalStudents);
		report.setScience((Integer)science/totalStudents);
		report.setAveragePercentile(percentile);
		return report;
	}

	@Override
	public void setMarks(Integer studentId, Semester semester) {
		// TODO Auto-generated method stub
		//FUNCTIONAL PROGRAMMING
		Student student=studentRepo.findById(studentId).orElseThrow(()->
		new RuntimeException("student not found with the id: "+studentId));

		student.getSemesters().get(semester.getId()-1).setEnglish(semester.getEnglish());
		student.getSemesters().get(semester.getId()-1).setMaths(semester.getMaths());
		student.getSemesters().get(semester.getId()-1).setScience(semester.getScience());

		studentRepo.save(student);
	}

	@Override
	public List<Student> topTwoStudents() {
		// TODO Auto-generated method stub
		//FINDING ALL STUDENTS
		List<Student>students=studentRepo.findAll();
		HashMap<Integer,Student>map=new HashMap<>();
		//System.out.println(students);
		for(int i=0; i<students.size(); i++) {
			int sum=0;
			sum+=students.get(i).getSemesters().get(0).getEnglish();
			sum+=students.get(i).getSemesters().get(0).getMaths();
			sum+=students.get(i).getSemesters().get(0).getScience();
			sum+=students.get(i).getSemesters().get(1).getEnglish();
			sum+=students.get(i).getSemesters().get(1).getMaths();
			sum+=students.get(i).getSemesters().get(1).getScience();
			map.put(sum,students.get(i));
		}
		Collection<Integer> collection=map.keySet();
		
		List<Integer> list=new ArrayList<>(collection);

		Collections.sort(list);
		
		List<Student>output=new ArrayList<>();
		
		int first=list.get(list.size()-1);
		int second=list.get(list.size()-2);
		
		for(Map.Entry<Integer, Student> m:map.entrySet()) {
			if(m.getKey()==first) {
				output.add(m.getValue());
			}
			if(m.getKey()==second) {
				output.add(m.getValue());
			}
		}
		
		return output;
	}

}
