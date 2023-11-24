package com.casestudy.pillar.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.pillar.casestudy.CustomException.UnableToGenerateDataException;
import com.casestudy.pillar.casestudy.model.Student;
import com.casestudy.pillar.casestudy.repository.SubjectRepository;
import com.casestudy.pillar.casestudy.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	SubjectRepository repository;
	
	
	@GetMapping("/students")
	@ResponseBody
	public ResponseEntity<Student> getStudentList(){
		
	return new ResponseEntity<Student>(new Student(),HttpStatusCode.valueOf(200));
		
	}
	
	@GetMapping("/exception/{type}")
	@ResponseBody
	public ResponseEntity<Exception> getException(@PathVariable String type) throws UnableToGenerateDataException{
		
		if(type.equals("generation")) {
			throw new UnableToGenerateDataException("student");
		
		}
		throw new RuntimeException("Something went wrong");
		
	}
}
