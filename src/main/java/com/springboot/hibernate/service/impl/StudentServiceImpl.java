package com.springboot.hibernate.service.impl;

import javax.websocket.Session;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.springboot.hibernate.dao.StudentDao;
import com.springboot.hibernate.model.Student;
import com.springboot.hibernate.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void saveStudentDetails(Student student) {
		studentDao.saveStudentDetails(student);
	}

	@Override
	public Student getStudentDetails(long studentId) {
		return studentDao.getStudentDetails(studentId);
	}
	
	@Override
	public List<Student> getAllStudentDetails(){
		return studentDao.getAllStudentDetails();
	}
	

	}






