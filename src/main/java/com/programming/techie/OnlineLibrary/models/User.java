package com.programming.techie.OnlineLibrary.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class User {
	@Id
	@Column(name= "u_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int u_id;
	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "address")
	private String address;
	@Column(name = "b1_name")
	private String b1_name;
	@Column(name = "b2_name")
	private String b2_name;
	@Column(name = "uf_name")
	private String uf_name;
	@Column(name = "um_name")
	private String um_name;
	@Column(name = "ul_name")
	private String ul_name;
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getB1_name() {
		return b1_name;
	}

	public void setB1_name(String b1_name) {
		this.b1_name = b1_name;
	}

	public String getB2_name() {
		return b2_name;
	}

	public void setB2_name(String b2_name) {
		this.b2_name = b2_name;
	}

	public String getUf_name() {
		return uf_name;
	}

	public void setUf_name(String uf_name) {
		this.uf_name = uf_name;
	}

	public String getUm_name() {
		return um_name;
	}

	public void setUm_name(String um_name) {
		this.um_name = um_name;
	}

	public String getUl_name() {
		return ul_name;
	}

	public void setUl_name(String ul_name) {
		this.ul_name = ul_name;
	}
}
