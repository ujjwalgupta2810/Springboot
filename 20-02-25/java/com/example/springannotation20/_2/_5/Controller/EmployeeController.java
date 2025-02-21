 package com.example.springannotation20._2._5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import  com.example.springannotation20._2._5.Entity.*;
import com.example.springannotation20._2._5.Service.EmployeeService;

import org.springframework.web.bind.annotation.RequestParam;
import com.example.springannotation20._2._5.Entity.*;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getEmployee")
	public String getEmployee() {
		return employeeService.getEmployee();
	}
//@RequestMapping(path = "/getEmployee", method = RequestMethod.GET)
//public String getemployee() {
//	return "employee";
//}

//@RequestMapping(path = "/addEmployee", method = RequestMethod.POST)
//public String addemployee() {
//	return "employee";
	
//}


//@RequestMapping(path = "/updateEmployee", method = RequestMethod.PUT)
//public String putemployee() {
//	return "employee";
//}
//
//@RequestMapping(path = "/deleteEmployee", method = RequestMethod.DELETE)
//public String deleteemployee() {
//	return "employee";
//}
//
//@GetMapping("/getEmployeeByID")
//public String getEmployeeByID1(@RequestParam Integer employeeId) {
//	return employeeId.toString();
////
//
//
//}
//
//
//
//@GetMapping("/getEmployeeByID")
//public String getEmployeeByID(@RequestParam(name = "id") Integer employeeId) {
//	return "getemployid";
//
//}
//
//
//@GetMapping("/getEmployeePathID/{employeeId}")
//public String getEmployeeByPathID(@PathVariable  Integer employeeId) {
//	return  employeeId.toString();
//
//	
//	}
//@PostMapping("/addEmployee")	
//public String addEmployee(@RequestBody Employee employee) {
//
//	return "added";
//}
//

}



