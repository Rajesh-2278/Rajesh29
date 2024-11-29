package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RajController {

	@GetMapping("/r1")
	public String run() {
		return "Rajesh -r11";
	}
	
	@PostMapping("/r2")
	public  String run1() {
		return "Rajesh -r22";
	}

	@GetMapping("/r3")
	public  String run3() {
		return "Rajesh -r33";
	}
}
