package com.example.demo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "user")
@SuppressWarnings("serial")
public class AuthenticationRequest implements Serializable {


//    private String username;
//    private String password;
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    //need default constructor for JSON Parsing
//    public AuthenticationRequest()
//    {
//
//    }
//
//    public AuthenticationRequest(String username, String password) {
//        this.setUsername(username);
//        this.setPassword(password);
//    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public AuthenticationRequest()
	  {
	
	  }
	
	  public AuthenticationRequest(int id, boolean active, String username, String password, String roles) {
		  this.setId(id);
		  this.setActive(active);
	      this.setUserName(username);
	      this.setPassword(password);
	      this.setRoles(roles);
	  }
}
