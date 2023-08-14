package com.demo.dao;

import javax.persistence.Entity;
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
@Entity
@Table(name = "users")

public class User {
	
@Id

private int id ;
private String firstName;
private String lastName;
private String email;
private String mobileNo;
private String dateOfBirth;
private String gender;


}
