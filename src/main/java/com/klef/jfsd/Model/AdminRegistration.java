package com.klef.jfsd.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="admin_Table")
public class AdminRegistration {
	  @Column(name = "adminfullname",unique =false,nullable = false,length = 50)
	  private String fullname;
	  private String email;
	  @Id
	  private String username;
	  private String password;
	  private String confirmpassword;
	  private String contact;
	  private String address;
	  
public String getFullname() {
		return fullname;
	}

public void setFullname(String fullname) {
		this.fullname = fullname;
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

public String getConfirmpassword() {
		return confirmpassword;
	}

public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

public String getContact() {
		return contact;
	}

public void setContact(String contact) {
		this.contact = contact;
	}

public String getAddress() {
		return address;
	}

public void setAddress(String address) {
		this.address = address;
	}
	  
}
