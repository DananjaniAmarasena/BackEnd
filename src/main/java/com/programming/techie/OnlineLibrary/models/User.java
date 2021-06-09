package com.programming.techie.OnlineLibrary.models;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;


@Data
@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String img;
	private String userName;
	private String regNumber;
	private String password;
	private String email;
	private String address;
	
	
	@ManyToOne
	private Role role;
	
	@OneToMany(mappedBy = "user")
	private List<Account> accounts;
	
	@OneToMany(mappedBy = "author")
	private List<Journal> journals;
	
	
	
	
}
