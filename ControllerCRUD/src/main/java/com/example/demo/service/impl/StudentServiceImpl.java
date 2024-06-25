package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
    
	StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public String createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return "Sucessfully Created ";
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return "Sucessfully Updated";
	}

	@Override
	public String deleteStudent(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Sucessfully Deleted";
	}

	@Override
	public Student getStudent(Long id) {
		// TODO Auto-generated method stub
		return 		studentRepository.findById(id).get();

	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
