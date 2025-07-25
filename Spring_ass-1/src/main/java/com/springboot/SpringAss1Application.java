package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@SpringBootApplication
public class SpringAss1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAss1Application.class, args);
		
		
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Boot!";
	}

}
