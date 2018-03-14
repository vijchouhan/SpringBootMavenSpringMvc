package com.springboot.hibernate.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.springboot.hibernate.model.Student;
@Service
public interface StudentService {
	void saveStudentDetails(Student student);
	Student getStudentDetails(long studentId); 
	List<Student> getAllStudentDetails();

}
