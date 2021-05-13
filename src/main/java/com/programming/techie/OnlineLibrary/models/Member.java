package com.programming.techie.OnlineLibrary.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Member {
	@Id
	@Column(name= "member_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int member_id;
	
	
	private int journal ;

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}


	public int getJournal() {
		return journal;
	}

	public void setJournal(int journal) {
		this.journal = journal;
	}
	
	
}