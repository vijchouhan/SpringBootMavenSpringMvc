package com.springboot.hibernate.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.springboot.hibernate.model.Student;

@Repository
public interface StudentDao {
	void saveStudentDetails(Student student);
	//void saveStudentDetails();
	Student getStudentDetails(long studentId);

}
