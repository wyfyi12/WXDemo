package com.entities;

import java.io.Serializable;

public class userEntity implements Serializable {  
	  
    private static final long serialVersionUID = 3096154202413606831L;  
    private String userId;  
    private String userName;  
    private String userPlace;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPlace() {
		return userPlace;
	}
	public void setUserPlace(String userPlace) {
		this.userPlace = userPlace;
	}  
      
}