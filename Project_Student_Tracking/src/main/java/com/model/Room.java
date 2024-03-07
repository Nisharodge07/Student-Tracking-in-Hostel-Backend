package com.model;

import javax.persistence.*;


@Entity
public class Room 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int room_id;
	private int room_number;
	private int room_capacity;
	
	@ManyToOne	
	Hostel hostel;

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(int room_id, int room_number, int room_capacity, Hostel hostel) {
		super();
		this.room_id = room_id;
		this.room_number = room_number;
		this.room_capacity = room_capacity;
		this.hostel = hostel;
	}

	@Override
	public String toString() {
		return "Room [room_id=" + room_id + ", room_number=" + room_number + ", room_capacity=" + room_capacity
				+ ", hostel=" + hostel + "]";
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	public int getRoom_capacity() {
		return room_capacity;
	}

	public void setRoom_capacity(int room_capacity) {
		this.room_capacity = room_capacity;
	}

	public Hostel getHostel() {
		return hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}

}
