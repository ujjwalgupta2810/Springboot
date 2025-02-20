package com.example.AnnotationController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

//@Controller
//
//public class EmployeeController {
//
//@GetMapping("/getEmployee")
//@ResponseBody //it is showing it is a body and nothing more 
//public String getEmployee() {
//
//	return "employee";
//		
	
@RestController

public class EmployeeController {

@GetMapping("/getEmployee")
public String getEmployee() {

	return "employee";
		

	}
@GetMapping("/getEmployeebyId/{em ployeeId")
public String getEmployeebyId(@RequestParam(name = "id") Integer employeeId ) {

	return "employee";
		

	}
@PostMapping("/getEmployee")
public String postEmployee() {

	return "added";
		

	}
@PutMapping("/getEmployee")
public String putEmployee() {

	return "updated";
		

	}
@DeleteMapping("/deleteEmployee")
public String deleteEmployee() {

	return "deleted";
	
		

	}


	
}

