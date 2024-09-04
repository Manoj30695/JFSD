package com.klef.jfsd.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="addemployee_table")
public class AddEmployee 
{ 
  @Id	
  private int id;
  @Column(name = "fname",unique =false,nullable = false,length = 50)
  private String name;
  private String email;
  private String dob;
  private String gender;
  private String department;
  private String course;
  private Double grade;
  private String contact;
  
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Double getGrade() {
	return grade;
}
public void setGrade(Double grade) {
	this.grade = grade;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

}
