package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentLogin 
{

	@Id
	private int	studId;
	private String studEmail;
	private String studPassword;
	public StudentLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentLogin(int studId, String studEmail, String studPassword) {
		super();
		this.studId = studId;
		this.studEmail = studEmail;
		this.studPassword = studPassword;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public String getStudPassword() {
		return studPassword;
	}
	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}
	@Override
	public String toString() {
		return "StudentLogin [studId=" + studId + ", studEmail=" + studEmail + ", studPassword=" + studPassword + "]";
	}
	
	
}
