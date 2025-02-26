package com.example.docker.jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerJenkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJenkinApplication.class, args);
	}

	@GetMapping("/home")
	public String home() {
		return "This is my Docker Jenkin Integration application!";
	}
}
