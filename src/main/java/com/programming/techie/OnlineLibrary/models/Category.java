package com.programming.techie.OnlineLibrary.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String name;
	
	@JsonBackReference(value = "book_category")
	@OneToMany(mappedBy = "category")
	private List<Book> books;
	
	@JsonBackReference(value = "journal_category")
	@OneToMany(mappedBy = "category")
	private List<Journal> journals;
	

}
