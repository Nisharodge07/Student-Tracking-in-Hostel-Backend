package com.model;

import javax.persistence.*;

//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;

@Entity
public class Hostel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hostel_id;
	private String hostel_name;
	private String hostel_address;
	private int hostel_capacity;
	
	
	public Hostel()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Hostel(int hostel_id, String hostel_name, String hostel_address, int hostel_capacity)
	{
		super();
		this.hostel_id = hostel_id;
		this.hostel_name = hostel_name;
		this.hostel_address = hostel_address;
		this.hostel_capacity = hostel_capacity;
	}
	public int getHostel_id()
	{
		return hostel_id;
	}
	public void setHostel_id(int hostel_id) {
		this.hostel_id = hostel_id;
	}
	public String getHostel_name() {
		return hostel_name;
	}
	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}
	public String getHostel_address() {
		return hostel_address;
	}
	public void setHostel_address(String hostel_address) {
		this.hostel_address = hostel_address;
	}
	public int getHostel_capacity() {
		return hostel_capacity;
	}
	public void setHostel_capacity(int hostel_capacity) {
		this.hostel_capacity = hostel_capacity;
	}
	@Override
	public String toString() {
		return "Hostel [hostel_id=" + hostel_id + ", hostel_name=" + hostel_name + ", hostel_address=" + hostel_address
				+ ", hostel_capacity=" + hostel_capacity + "]";
	}

	
}
