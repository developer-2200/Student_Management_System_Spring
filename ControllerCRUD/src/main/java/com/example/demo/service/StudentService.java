package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	 public String createStudent(Student student);
	  public String updateStudent(Student student);
	  public String deleteStudent(Long id);
	  public Student getStudent(Long id);
	  public List<Student> getAllStudent();

}
