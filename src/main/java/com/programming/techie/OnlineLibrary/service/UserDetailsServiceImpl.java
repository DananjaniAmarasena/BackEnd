package com.programming.techie.OnlineLibrary.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.programming.techie.OnlineLibrary.models.User;
import com.programming.techie.OnlineLibrary.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired 
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		User user = userRepository.findByUserName(userName).orElseThrow(()-> new UsernameNotFoundException(String.format("No user found",userName)));
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),
				true,true,true,true,getAuthorities("ROLE_USER"));
		
	}

	private Collection<? extends GrantedAuthority> getAuthorities(String role_user) {
		// TODO Auto-generated method stub
		return Collections.singletonList(new SimpleGrantedAuthority(role_user));
	}
}
