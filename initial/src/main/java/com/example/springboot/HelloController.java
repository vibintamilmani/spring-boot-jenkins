package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "This is devops class";
	}
	@GetMapping("/hello")
	public String index() {
		return "this is hello world program";
	}

}
