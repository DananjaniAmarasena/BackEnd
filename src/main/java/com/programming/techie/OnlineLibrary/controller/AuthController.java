package com.programming.techie.OnlineLibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programming.techie.OnlineLibrary.dto.LoginRequest;
import com.programming.techie.OnlineLibrary.dto.RegisterRequest;
import com.programming.techie.OnlineLibrary.service.AuthService;

@RestController 
@RequestMapping("/api/auth")

public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/signup")
	public ResponseEntity signup(@RequestBody RegisterRequest registerRequest) {
		authService.signup(registerRequest);
		return (ResponseEntity) new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping("/login") 
	public String login(@RequestBody LoginRequest loginRequest) {
		return authService.login(loginRequest);
	} 
}
