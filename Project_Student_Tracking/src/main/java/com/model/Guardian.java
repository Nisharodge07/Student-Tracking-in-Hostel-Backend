package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Guardian 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guardian_id;
	private String guardian_name;
	private String guardian_relation;
	private long guardian_contact;
	private String guardian_email;
	
	private int studId;

	public Guardian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guardian(int guardian_id, String guardian_name, String guardian_relation, long guardian_contact,
			String guardian_email, int studId) {
		super();
		this.guardian_id = guardian_id;
		this.guardian_name = guardian_name;
		this.guardian_relation = guardian_relation;
		this.guardian_contact = guardian_contact;
		this.guardian_email = guardian_email;
		this.studId = studId;
	}

	public int getGuardian_id() {
		return guardian_id;
	}

	public void setGuardian_id(int guardian_id) {
		this.guardian_id = guardian_id;
	}

	public String getGuardian_name() {
		return guardian_name;
	}

	public void setGuardian_name(String guardian_name) {
		this.guardian_name = guardian_name;
	}

	public String getGuardian_relation() {
		return guardian_relation;
	}

	public void setGuardian_relation(String guardian_relation) {
		this.guardian_relation = guardian_relation;
	}

	public long getGuardian_contact() {
		return guardian_contact;
	}

	public void setGuardian_contact(long guardian_contact) {
		this.guardian_contact = guardian_contact;
	}

	public String guardian_email() {
		return guardian_email;
	}

	public void setGuardian_address(String guardian_email) {
		this.guardian_email = guardian_email;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	@Override
	public String toString() {
		return "Guardian [guardian_id=" + guardian_id + ", guardian_name=" + guardian_name + ", guardian_relation="
				+ guardian_relation + ", guardian_contact=" + guardian_contact + ", guardian_email="
				+ guardian_email + ", studId=" + studId + "]";
	}

	

	

	

	

	

	

	
	
	
	

}
