package com.programming.techie.OnlineLibrary.service;


import com.programming.techie.OnlineLibrary.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
	private String authenticationToken;
    private String userName;
    private User authUser;
}
