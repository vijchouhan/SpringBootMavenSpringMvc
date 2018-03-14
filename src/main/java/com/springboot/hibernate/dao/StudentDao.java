package com.springboot.hibernate.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.springboot.hibernate.model.Student;

@Repository
public interface StudentDao {
	void saveStudentDetails(Student student);
	Student getStudentDetails(long studentId);
	List<Student> getAllStudentDetails();

}
