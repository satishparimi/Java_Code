package com.host.java8.serialization;

import java.io.Serializable;

public class AccountDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5418014198699075014L;
	
	private String username = "";
	
	transient private String emailID = "";
	
	transient private String userPassword = "";
	
	public AccountDetails() {
		
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getUserName() {
		return username;
	}
	
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public String getEmailID() {
		return emailID;
	}
	
	public void setUserPassword(String password) {
		this.userPassword = password;
	}
	
	public String getPassword() {
		return userPassword;
	}
	
	@Override
	public String toString() {
		return "Account Details [Username = "+username+", userEmail id = "+emailID+", userPassowrd = "+userPassword+ " ]";
	}

}
