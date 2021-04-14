package com.yadiel.theCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TheCodeApplication {
	
	@RequestMapping("/hello")
	public String greeting() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(TheCodeApplication.class, args);
	}

}
