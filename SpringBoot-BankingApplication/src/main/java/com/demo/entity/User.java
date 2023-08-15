package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // for Table creation in Schema
@Table(name = "user") // Table Name ..Not Necessary
public class User {

	@Id // for Primary Key Selection in User-Table
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for Id AutoGeneration &
	private int id;

	 @Column (nullable=false) // User Input should not null
	private String name;

	@Column(nullable=false,unique= true) // Unique email required -checks
	private String email;

	 @Column(nullable=false, unique=true) // Unique email required
	private String mobileNumber;

	 @Column(nullable=false)
	private String dateOfBirth;

	 @Column(nullable=false)
	private String gender;

	public User() {

	}

	public User(int id, String name, String email, String mobileNumber, String dateOfBirth, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
