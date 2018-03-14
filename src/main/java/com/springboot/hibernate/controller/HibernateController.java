package com.springboot.hibernate.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.MainApp;
import com.springboot.hibernate.model.Student;
import com.springboot.hibernate.service.StudentService;

@Controller
public class HibernateController {
	private static final Logger logger = LogManager.getLogger(MainApp.class);
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ResponseEntity saveStudentDetails(@RequestBody Student student) {
		//public ResponseEntity saveStudentDetails() {
		studentService.saveStudentDetails(student);
		//studentService.saveStudentDetails();
		return new ResponseEntity(student, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	//public @ResponseBody Student getStudentDetails(@RequestParam long studentId) {
	public ResponseEntity getStudentDetails(@RequestParam long studentId) {	
		//studentService.saveStudentDetails(student);
		Student student = studentService.getStudentDetails(studentId);
		return new ResponseEntity(student, HttpStatus.OK);
	}
	
/* request object for saveStudent method...........
 * http://localhost:8086/saveStudent
 {
    "studentName": "Vijay",
    "studentPhoneNumbers": [

        {
            "phoneType": "A",
            "phoneNumber": "121212"
        },
        {
            "phoneType": "B",
            "phoneNumber": "2323232"
        },
    	{
            "phoneType": "D",
            "phoneNumber": "4545454"
        },
        {
            "phoneType": "E",
            "phoneNumber": "67676767"
        },
        {
            "phoneType": "C",
            "phoneNumber": "343434"
        }
       
    ]
}
 */
	
	
	
/* url for getStudent method....
 * http://localhost:8086/getStudent?studentId=1
 * http://localhost:8086/getStudent?studentId=2
 * http://localhost:8086/getStudent?studentId=3
 */	
	
}
