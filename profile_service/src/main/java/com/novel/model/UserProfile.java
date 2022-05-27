package com.novel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserProfile {
	@Id
	private int id;
	private String fullName;
	private String email;
	private Long mobileNumber;
	private String about;
	private String dateOfBirth;
	private String gender;
	private String role;
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserProfile(int id, String fullName, String email, Long mobileNumber, String about, String dateOfBirth,
					  String gender, String role, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.about = about;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.role = role;
		this.password = password;
	}



}
