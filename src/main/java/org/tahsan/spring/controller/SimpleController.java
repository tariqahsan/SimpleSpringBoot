package org.tahsan.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleController {
	
	@GetMapping
	public String greeting() {
		return "Hello everyone!!!";
	}

}
