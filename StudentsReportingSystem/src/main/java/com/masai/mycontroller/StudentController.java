package com.masai.mycontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.masai.model.MarksDTO;
import com.masai.model.Semester;
import com.masai.model.Student;
import com.masai.services.StudentServices;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class StudentController {

	@Autowired
	private StudentServices studentService;
	
	@RequestMapping("/")
	private String homePage() {
		return "home.jsp";
	}
	
	@RequestMapping(value = "add-student", method = RequestMethod.POST)
	public String saveStudent(HttpServletRequest request) {
		Student student=new Student(Integer.parseInt(request.getParameter("rollNumber")),
				request.getParameter("name")
				,request.getParameter("gender"), request.getParameter("address")
				,request.getParameter("email"));
		studentService.createStudent(student);
		
		return "home.jsp";
	}
	

	@RequestMapping(value = "add-marks", method = RequestMethod.POST)
	public String editMarks(HttpServletRequest request) {
		Integer roll=Integer.parseInt(request.getParameter("rollNumber"));
		Semester semester=new Semester(Integer.parseInt(request.getParameter("id")),Integer.parseInt(request.getParameter("english")), 
											Integer.parseInt(request.getParameter("maths")) , Integer.parseInt(request.getParameter("science")));
		
		studentService.setMarks(roll, semester);
		
		return "home.jsp";
	}
	
	
	@RequestMapping("/topStudents")
	public ModelAndView topTwoStudents() {
		List<Student> list=studentService.topTwoStudents();
		ModelAndView model=new ModelAndView();
		model.addObject("list",list);
		model.setViewName("TopStudents.jsp");
		return model;
	}
	
	
	@RequestMapping(value = "choose-semester", method = RequestMethod.POST)
	public ModelAndView averageReport(HttpServletRequest request) {
		Integer semester=Integer.parseInt(request.getParameter("semester"));
		
		MarksDTO report=studentService.averageReports(semester);
		
		List<MarksDTO>list=new ArrayList<>();
		list.add(report);
		
		ModelAndView model=new ModelAndView();
		model.addObject("list",list);
		model.setViewName("averageReport.jsp");
	
		return model;
	}
	
	
	
	
}
