package com.spring.Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class NeedAuthController {
	
	@GetMapping("/login")
	void getLogin() {
		System.out.println("/auth/login");
	}
}
