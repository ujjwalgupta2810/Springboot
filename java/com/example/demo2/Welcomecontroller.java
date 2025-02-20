package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcomecontroller {
	

	

	
	
		
		@GetMapping("/us")
		String abc(){
			return "ujjwal gupta";
		}

	}
	  

