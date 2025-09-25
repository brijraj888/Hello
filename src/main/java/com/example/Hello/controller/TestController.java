package com.example.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/getRequest")
	public String getRequest() {
		return "Inside Get Request";
	}

	@PostMapping("/postRequest")
	public String postRequest() {
		return "Inside Post Request";
	}

}
