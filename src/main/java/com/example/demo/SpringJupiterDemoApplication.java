package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class SpringJupiterDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJupiterDemoApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello User your application is deployed successfully to acure";
	}

}
