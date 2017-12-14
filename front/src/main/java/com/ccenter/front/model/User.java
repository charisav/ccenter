package com.ccenter.front.model;

import java.util.Date;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private String passwordConfirm;
	private Date dateOfBirth;
	private String gender;
	
	public User() {}
	
	public User(String firstName, String lastName, String email, String username, String password,
			String passwordConfirm, Date dateOfBirth, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String confirmPassword) {
		this.passwordConfirm = confirmPassword;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
