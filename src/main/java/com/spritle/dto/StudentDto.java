package com.spritle.dto;

import org.springframework.stereotype.Component;

public class StudentDto {

	private static final String Userid="student1@gmail.com";
	
	private static final String Password="12345";

	public String getUserId() {
		return Userid;
	}

//	public void setUserId(String userId) {
//		Userid = userid;
//	}

	public String getPassword() {
		return Password;
	}

//	public void setPassword(String password) {
//		Password = password;
//	}
	
}
