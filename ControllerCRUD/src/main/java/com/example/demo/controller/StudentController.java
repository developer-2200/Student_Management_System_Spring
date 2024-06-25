package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
      StudentService studentService;
      
      
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student> createStudentDetail() 
	{
		
		return studentService.getAllStudent();
	}


	@GetMapping("{id}")
	public Student createStudentDetail(@PathVariable("id") Long id) 
	{
		
		return studentService.getStudent(id);
	}
	
	@PostMapping
	public String createStudentDetal(@RequestBody Student student) {
		studentService.createStudent(student);
		return "Sucessfull";
	}
	@PutMapping
	public  String updateStudentDetail(@RequestBody Student student) {
		studentService.updateStudent(student);
		return "update sucessfully";
	}
	@DeleteMapping("{id}")
	public String deleteCloudVendorDetails(@PathVariable("id") Long id) {
		studentService.deleteStudent(id);
		return "Deleted sucessfully";
		
	}
	
	

}
