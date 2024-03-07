package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RoomRepository;

import com.model.Room;

@Service
public class Room_Service_Implementation implements Room_Service
{

	@Autowired
	RoomRepository roomRepo;
	
	public Room saveRoom(Room r) {
		
		return roomRepo.save(r);
	}

	@Override
	public List<Room> getAllRoom(Room r) {
		
		return roomRepo.findAll();
	}

	@Override
	public Room updateRoom(Room r) {
		Room existingRoom =roomRepo.findById(r.getRoom_id()).orElse(null);
		existingRoom.setRoom_capacity(r.getRoom_capacity());	
		return roomRepo.save(existingRoom);
	}

	@Override
	public String deleteRoom(int id)
	{
		 roomRepo.deleteById(id);
		 return "deleted student";
	}

	@Override
	public Room getOneRoom(int id)
	{	
		return roomRepo.findById(id).orElse(null);
	}


}
