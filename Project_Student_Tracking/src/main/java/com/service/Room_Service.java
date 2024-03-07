package com.service;

import java.util.List;

import com.model.Room;

public interface Room_Service
{
	public Room saveRoom(Room s);
	
	public Room getOneRoom(int id);
	
	public List<Room> getAllRoom(Room r);
	
	public Room updateRoom(Room r);
	
	public String deleteRoom(int id);

}
