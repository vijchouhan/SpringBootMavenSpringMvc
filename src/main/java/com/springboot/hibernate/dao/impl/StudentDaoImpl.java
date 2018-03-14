package com.springboot.hibernate.dao.impl;

import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.websocket.Session;

import org.hibernate.Criteria;
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
	
	/*	public void saveStudentDetails(){
	
		HashSet<Phone> setPhone= new HashSet<Phone>();
		setPhone.add(new Phone("A","121212"));
		setPhone.add(new Phone("B","2323232"));
		setPhone.add(new Phone("C","343434"));
		setPhone.add(new Phone("D","4545454"));
		setPhone.add(new Phone("E","67676767"));
		
		Student student = new Student("Vijay", setPhone);	*/	
		entityManager.merge(student);
	}

	@Override
	public Student getStudentDetails(long studentId) {
		return entityManager.find(Student.class,studentId);

	}

	
}
