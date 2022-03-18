package com.simplilearn.FoodApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")

public class User {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	

	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String emailId;

	@Column(name = "password")
	private String password;

	@Column(name = "type")
	private String type;
	
	public User() {}
	

	

	public User(Long id, String name, String emailId, String password, String type) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.type = type;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmailId() {
		return emailId;
	}




	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}







}
