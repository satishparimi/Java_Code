package com.host.java8.LambdaEpressions;

public class User {

	private String username;
	private String userID;
	
	public User(String userName, String userID) {
		this.username = userName;
		this.userID = userID;
	}
	
	public void setUserName(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUserId(String userId) {
		
		this.userID = userId;
	}
	
	public String getUserId() {
		return userID;
	}
	
	public String toString() {
		return "[Username = "+username+", UserID = "+userID+" ]";
	}
	
}

