package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity // for Table creation in Schema
@Table(name="user") // Table Name ..Not Necessary
public class User {

	@Id // for Primary Key Selection in User-Table
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for Id AutoGeneration &
	private int id;

	@Column (nullable=false)  // User Input should not null
	private String name;
	
	@Column(nullable=false,unique= true) // Unique email required -checks
	private String email;
	
	@Column(nullable=false, unique=true) // Unique email required
	private String mobileNumber;
	
	@Column(nullable=false) 
	private String dateOfBirth;
	
	@Column(nullable=false) 
	private String gender;

}
