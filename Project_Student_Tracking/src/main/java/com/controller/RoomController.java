package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Room;
import com.service.Room_Service;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RoomController
{

	@Autowired
	Room_Service roomService;
	//=========================Save Data===================
	/*
	@PostMapping("/addRoom")
	public Room saveRoom(@RequestBody Room r)
	{
		return roomService.saveRoom(r);
	}
	*/
	//-------Using Response Entity--------------
	@PostMapping("/addRoom")
	public ResponseEntity<Room> saveRoom(@RequestBody Room r)
	{
		Room r1=roomService.saveRoom(r);
		return ResponseEntity.status(HttpStatus.CREATED).header("AddRoom", "Room created").body(r1);
	}
	
	
	//=========================Get One Data By Id===================
/*
	@GetMapping("/getOneRoom/{id}")
	public Room getOneRoom(@PathVariable int id)
	{
		return roomService.getOneRoom(id);
	}
*/	
	//-------Using Response Entity--------------
	@GetMapping("/getOneRoom/{id}")
	public ResponseEntity<Room> getOneRoom(@PathVariable int id)
	{
		Room r1=roomService.getOneRoom(id);
		return ResponseEntity.ok(r1);
	}
	
	
	
	//=========================Get All Data ===================
/*	
	@GetMapping("/getAllRoom")
	public List<Room> getAllRoom( Room r)
	{
		return roomService.getAllRoom(r);
	}
*/	
	//-------Using Response Entity--------------
	@GetMapping("/getAllRoom")
	public ResponseEntity<List<Room>> getAllRoom( Room r)
	{
		List<Room> r1=roomService.getAllRoom(r);
		return ResponseEntity.ok(r1);
	}
	
	
	
	
	//========================= Update Data ===================
/*
	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room r)
	{
		return roomService.updateRoom(r);
	}
*/	
	//-------Using Response Entity--------------
	@PutMapping("/updateRoom")
	public ResponseEntity<Room> updateRoom(@RequestBody Room r)
	{
		Room r1=roomService.updateRoom(r);
		return ResponseEntity.ok(r1);
	}
	
	
	//========================= Delete Data ===================
/*	
	@DeleteMapping("/deleteRoom/{id}")
	public void deleteRoom(@PathVariable int id)
	{
		roomService.deleteRoom(id);
			
	}
*/		
	//-------Using Response Entity--------------
	@DeleteMapping("/deleteRoom/{id}")
	public ResponseEntity<String> deleteRoom(@PathVariable int id)
	{
	  String r1=roomService.deleteRoom(id);
		return ResponseEntity.ok(r1);
	}		
	
}
