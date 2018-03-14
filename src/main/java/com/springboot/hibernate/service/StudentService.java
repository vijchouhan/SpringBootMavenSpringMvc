package com.springboot.hibernate.service;

import org.springframework.stereotype.Service;

import antlr.collections.List;

import com.springboot.hibernate.model.Student;
@Service
public interface StudentService {
	void saveStudentDetails(Student student);
	//void saveStudentDetails();
	Student getStudentDetails(long studentId); 

}
