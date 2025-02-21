package com.example.springannotation20._2._5.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	public String getEmployee() {
		//db operation - get employee from db
		return "akshay"; 
	}
}
