package com.spring.Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

//	public TestController(CustomUserDetailsManagerImpl customUserDetailsManagerImpl) {
//		this.customUserDetailsManagerImpl = customUserDetailsManagerImpl;
//	}
//
	@GetMapping("/login")
	void getLogin() {
//		customUserDetailsManagerImpl.loadUserByUsername()
		System.out.println("/api/v1/test");
	}
}
