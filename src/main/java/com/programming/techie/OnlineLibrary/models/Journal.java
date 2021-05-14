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

	public int getJ_id() {
		return j_id;
	}
	public void setJ_id(int j_id) {
		this.j_id = j_id;
	}
	public String getJ_title() {
		return j_title;
	}
	public void setJ_title(String j_title) {
		this.j_title = j_title;
	}
	public String getJ_writer() {
		return j_writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setJ_writer(String j_writer) {
		this.j_writer = j_writer;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	@GeneratedValue(strategy= GenerationType.TABLE)
	private int id;
	private String title;
	
	@ManyToOne
	private User author;
	
	
}


