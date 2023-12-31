package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootCustAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCustAppApplication.class, args);
	}
		 @RequestMapping("/")
	    public String home() {
	        return "Welcome Shell KK Here !! Spring Boot First Demo Shell";
	    }
		 @RequestMapping("/sayHello")
		    public String sayHello() {
		        return "Welcome Say Hello Shell KK Here !! Spring Boot First Demo Shell";
		    }
}
