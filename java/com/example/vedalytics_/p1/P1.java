package com.example.vedalytics_.p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class P1 {
//@RequestMapping("/test")
	@GetMapping("/test") //post mapping'
public String firstHandler() {
	return "get mapping !!";
}
	public void test() {
		System.out.println("ujjwal");
	}
}
