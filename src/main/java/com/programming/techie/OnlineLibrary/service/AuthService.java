package com.programming.techie.OnlineLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.programming.techie.OnlineLibrary.dto.LoginRequest;
import com.programming.techie.OnlineLibrary.dto.RegisterRequest;
import com.programming.techie.OnlineLibrary.models.User;
import com.programming.techie.OnlineLibrary.repository.UserRepository;
import com.programming.techie.OnlineLibrary.security.JwtProvider;

import java.util.Optional;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired 
	private AuthenticationManager authenticationManager;
	
	@Autowired 
	private JwtProvider jwtProvider;


	public void signup(RegisterRequest registerRequest) {
		User user = new User();
		user.setUserName(registerRequest.getUserName());
		user.setPassword(encodePassword(registerRequest.getPassword()));
		user.setEmail(registerRequest.getEmail());
		userRepository.save(user); 
	}

	private String encodePassword(String password) {
		// TODO Auto-generated method stub
		return passwordEncoder.encode(password);
	}

	public AuthenticationResponse login(LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUserName(),
                loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        String authenticationToken = jwtProvider.generateToken(authenticate);
        return new AuthenticationResponse(authenticationToken, loginRequest.getUserName());
    }

	public static Optional<User> getCurrentUser() {
		User principal = (User)SecurityContextHolder.
				getContext().getAuthentication().getPrincipal();
		return Optional.of(principal);
	}
}
