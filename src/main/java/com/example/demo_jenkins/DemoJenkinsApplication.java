package com.example.demo_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

	@GetMapping(value = "hello/{name}")
	public String getMessage(@PathVariable String name) {
		return "Hello: " + name;
	}

}
