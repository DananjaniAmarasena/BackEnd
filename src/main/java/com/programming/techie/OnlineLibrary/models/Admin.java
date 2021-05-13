package com.programming.techie.OnlineLibrary.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Admin {
	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int a_id;
	@Column(name = "af_name")
	private String af_name;
	@Column(name = "al_name")
	private String al_name;
	
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAf_name() {
		return af_name;
	}
	public void setAf_name(String af_name) {
		this.af_name = af_name;
	}
	public String getAl_name() {
		return al_name;
	}
	public void setAl_name(String al_name) {
		this.al_name = al_name;
	}
	
	
}
