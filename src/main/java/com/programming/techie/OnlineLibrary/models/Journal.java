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
	@Column(name= "j_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int j_id;
	@Column(name= "j_title")
	private String j_title;
	@Column(name= "j_writer")
	private String j_writer;
	@Column(name = "user_type")
	private String user_type;
	@Column(name = "content")
	private String content;

	private String title;
	
	@ManyToOne
	private User author;
	
	
}


