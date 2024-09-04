package com.klef.jfsd.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Apply_Leave")
public class ApplyLeave {
	
	
	@Column(name = "id",unique =false,nullable = false,length = 10)
	  private int id;
	@Column(name = "fname",unique =false,nullable = false,length = 50)
	  private String name;	
	  private String department;
	  private String LType;
	  @Column(name = "Sdate",unique =true,nullable = false)
	  private String Sdate;
	  private String Edate;
	  @Id	
	  @Column(name = "reason",unique =true,nullable = false,length = 200)
	  private String reason;
	  private String applystatus;
	  
	
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLType() {
		return LType;
	}
	public void setLType(String lType) {
		LType = lType;
	}
	public String getSdate() {
		return Sdate;
	}
	public void setSdate(String sdate) {
		Sdate = sdate;
	}
	public String getEdate() {
		return Edate;
	}
	public void setEdate(String edate) {
		Edate = edate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getApplystatus() {
		return applystatus;
	}
	public void setApplystatus(String applystatus) {
		this.applystatus = applystatus;
	}
	  
	
	  
}
