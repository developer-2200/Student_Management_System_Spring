package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(Student student) {
		return  studentRepository.save(student);
	}
	public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
	public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
	public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }
	public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }


}
