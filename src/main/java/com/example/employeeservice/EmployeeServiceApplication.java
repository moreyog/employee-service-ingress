package com.example.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

	@GetMapping
	public String getIndexPage(){
		return "Test at root success";
	}

	@GetMapping("/employee")
	public String getEmp(){
		return "Test employee success";
	}
}
