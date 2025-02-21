package com.example.springannotation20._2._5.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springannotation20._2._5.Repository.EmployeeRepository;




@Service // we can also use as a component @component
public class EmployeeService {
	//Business logic
	@Autowired
	EmployeeRepository employeeRepository;
	
	
public String getEmployee() {
	return employeeRepository.getEmployee() ;
	

	
}

}




