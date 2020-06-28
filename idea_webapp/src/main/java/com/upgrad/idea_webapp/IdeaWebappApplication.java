package com.upgrad.idea_webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IdeaWebappApplication {

	public static void main(String[] args) {

		System.out.println("Hello SpringBoot");
		SpringApplication.run(IdeaWebappApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String helloStudents() {
		return "Students how are you";
	}

}
