package com.programming.techie.OnlineLibrary.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity

public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String role;
	
	@OneToMany(mappedBy = "role")
	private List<User> users;
}
