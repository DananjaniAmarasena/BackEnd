package com.programming.techie.OnlineLibrary.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
public class Journal {
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private int id;
	private String title;
	
	@ManyToOne
	private User author;
	
	
}


