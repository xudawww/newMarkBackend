package com.example.model.registerModel;

import java.io.Serializable;

public class registerRequest implements Serializable {
	private String user_name;
	private String email;
	private String password;
	public registerRequest()
	{
		
	}
	public registerRequest(String user_name, String email, String password) {
		this.user_name = user_name;
		this.email = email;
		this.password = password;
	}
	public String getUser_name() {
		return this.user_name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword() {
		return this.password;
	}

}
