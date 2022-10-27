package com.examplewebapplication.webapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/check")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
