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

public class Book {
	@Id

	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String img;
	private String author;
	private String title;
	private int year;
	private int no_of_copies ;
	
	@OneToMany(mappedBy = "book")
	private List<Account> accounts;
	
}

