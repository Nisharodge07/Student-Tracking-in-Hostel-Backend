package com.model;

import java.util.Date;


import javax.persistence.*;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int	studId;
	private String studFirstName;
	private String studLastName;
	private Date studDOB;
	private long studContact;
	private String studEmail;
	private String studPassword;
	private String studAddress;
	
	
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(int studId, String studFirstName, String studLastName, Date studDOB, long studContact,
			String studEmail, String studPassword, String studAddress) {
		super();
		this.studId = studId;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.studDOB = studDOB;
		this.studContact = studContact;
		this.studEmail = studEmail;
		this.studPassword = studPassword;
		this.studAddress = studAddress;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFirstName() {
		return studFirstName;
	}
	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}
	public String getStudLastName() {
		return studLastName;
	}
	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}
	public Date getStudDOB() {
		return studDOB;
	}
	public void setStudDOB(Date studDOB) {
		this.studDOB = studDOB;
	}
	public long getStudContact() {
		return studContact;
	}
	public void setStudContact(long studContact) {
		this.studContact = studContact;
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
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFirstName=" + studFirstName + ", studLastName=" + studLastName
				+ ", studDOB=" + studDOB + ", studContact=" + studContact + ", studEmail=" + studEmail
				+ ", studPassword=" + studPassword + ", studAddress=" + studAddress + "]";
	}
	
}
