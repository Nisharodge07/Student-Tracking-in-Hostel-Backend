package com.model;

import java.util.Date;
import javax.persistence.*;
@Entity
public class Attendence 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int attendence_id;
	private Date attendence_date;
	private String attendence_status;
	private int leaveDays;
	
	private int studId;

	public Attendence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendence(int attendence_id, Date attendence_date, String attendence_status, int leaveDays, int studId) {
		super();
		this.attendence_id = attendence_id;
		this.attendence_date = attendence_date;
		this.attendence_status = attendence_status;
		this.leaveDays = leaveDays;
		this.studId = studId;
	}

	public int getAttendence_id() {
		return attendence_id;
	}

	public void setAttendence_id(int attendence_id) {
		this.attendence_id = attendence_id;
	}

	public Date getAttendence_date() {
		return attendence_date;
	}

	public void setAttendence_date(Date attendence_date) {
		this.attendence_date = attendence_date;
	}

	public String getAttendence_status() {
		return attendence_status;
	}

	public void setAttendence_status(String attendence_status) {
		this.attendence_status = attendence_status;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	@Override
	public String toString() {
		return "Attendence [attendence_id=" + attendence_id + ", attendence_date=" + attendence_date
				+ ", attendence_status=" + attendence_status + ", leaveDays=" + leaveDays + ", studId=" + studId + "]";
	}

	


	

}
