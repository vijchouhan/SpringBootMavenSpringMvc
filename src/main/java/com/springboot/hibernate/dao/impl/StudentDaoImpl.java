package com.springboot.hibernate.dao.impl;

import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
//import javax.websocket.Session;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.springboot.hibernate.dao.StudentDao;
import com.springboot.hibernate.model.Phone;
import com.springboot.hibernate.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@PersistenceContext
    private EntityManager entityManager;
	
	@Transactional
	public void saveStudentDetails(Student student){
		entityManager.merge(student);
	}

	@Override
	public Student getStudentDetails(long studentId) {
		return entityManager.find(Student.class,studentId);

	}

	@Override
	public List<Student> getAllStudentDetails() {
	return entityManager.unwrap(Session.class).createCriteria(Student.class).list();
	}

	
}
