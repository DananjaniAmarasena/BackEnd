package com.programming.techie.OnlineLibrary.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.Data;


@Data
@Entity
public class Journal {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String user_type;
	private String content;
	private String title;
	
	@ManyToOne
	private User author;
	
	
}


