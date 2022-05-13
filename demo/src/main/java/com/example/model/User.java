package com.example.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String user_name;
    String password;
    String ava;
    String email;
    String token;
    String tokenDateTime;
    int status;
    User() {}
    public User(String user_name, String password,String email,String ava,String token,int status)
    {
        
        this.user_name = user_name;
        this.password = password;
        this.email = email;
        this.ava = ava;
        this.status = status;
        this.token = token;
    }
    public String getUser_name() {
    	return this.user_name;
    }
    public String getava() {
    	return this.ava;
    }
    public String getemail() {
    	return this.email;
    }
    public int getstatus() {
    	return this.status;
    }
    public String gettoken() {
    	return this.token;
    }
    public int getId() {
    	return this.id;
    }
}