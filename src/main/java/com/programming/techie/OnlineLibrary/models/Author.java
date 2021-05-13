package com.programming.techie.OnlineLibrary.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Author {
	@Id
	@Column(name= "author_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int author_id;
	
	
	private int journal ;

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public int getJournal() {
		return journal;
	}

	public void setJournal(int journal) {
		this.journal = journal;
	}


	
}