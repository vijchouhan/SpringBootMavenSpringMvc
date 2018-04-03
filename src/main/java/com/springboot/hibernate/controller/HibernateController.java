package com.springboot.hibernate.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

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

//@Controller
@RestController
@RequestMapping("/product")
@Api(value="HibernateCRUD", description="CRUD Operations by Hibernate H2Database")
public class HibernateController {
	private static final Logger logger = LogManager.getLogger(MainApp.class);
	@Autowired
	StudentService studentService;
	
	@ApiOperation(value="Save student details")
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ResponseEntity saveStudentDetails(@RequestBody Student student) {
		studentService.saveStudentDetails(student);
		return new ResponseEntity(student, HttpStatus.OK);
	}
	
	@ApiOperation(value="Get student details")
	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public ResponseEntity getStudentDetails(@RequestParam long studentId) {	
		Student student = studentService.getStudentDetails(studentId);
		return new ResponseEntity(student, HttpStatus.OK);
	}
	
	@ApiOperation(value="Get All student details")
	@RequestMapping(value = "/allStudents", method = RequestMethod.GET)
	public ResponseEntity getAllStudentDetails() {	
		List<Student> student = studentService.getAllStudentDetails();
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
	
	
/* url for getAllStudentDetails method....
 * http://localhost:8086/allStudents
 * */
}
