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

import com.model.Attendence;
import com.service.Attendence_Service;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AttendenceController
{
	@Autowired
	Attendence_Service attendenceService;

	//=========================Save Data===================

/*
	@PostMapping("/addAttendence")
	public Attendence saveAttendence(@RequestBody Attendence a)
	{
		return attendenceService.saveAttendence(a);
	}
*/
	//------------------Using ResponseEntity--------------------
	@PostMapping("/addAttendence")
	public ResponseEntity<Attendence> saveAttendence(@RequestBody Attendence a)
	{
		Attendence a1=attendenceService.saveAttendence(a);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add Attendence", "attendence created").body(a1);
	}
	
	
	
	//=========================Get One Data===================
	
/*	
	@GetMapping("/getOneAttendence/{id}")
	public Attendence getOneAttendence(@PathVariable int id)
	{
		return attendenceService.getOneAttendence(id);	
	}
*/
	//------------------Using ResponseEntity--------------------
	@GetMapping("/getOneAttendence/{id}")
	public ResponseEntity<Attendence> getOneAttendence(@PathVariable int id)
	{
		Attendence a1=attendenceService.getOneAttendence(id);
		return 	ResponseEntity.ok(a1);
	}
	
	
	
	
	//========================= Get All Data===================
/*	
	@GetMapping("/getAllAttendence")
	public List<Attendence> getAllAttendence( @RequestBody Attendence a)
	{
		return attendenceService.getAllAttendence(a);	
	}
*/
	//------------------Using ResponseEntity--------------------
	@GetMapping("/getAllAttendence")
	public ResponseEntity<List<Attendence>> getAllAttendence( @RequestBody Attendence a)
	{
      List<Attendence> a1=attendenceService.getAllAttendence(a);
		return ResponseEntity.ok(a1);	
	}
	
	
	//========================= Update Data===================
	
/*	
	@PutMapping("/updateAttendence")
	public Attendence updateAttendence(@RequestBody Attendence a)
	{
		return attendenceService.updateAttendence(a);	
	}
*/
	//------------------Using ResponseEntity--------------------
	@PutMapping("/updateAttendence")
	public ResponseEntity<Attendence> updateAttendence(@RequestBody Attendence a)
	{
		Attendence a1=attendenceService.updateAttendence(a);
		return 	ResponseEntity.ok(a1);
	}
	
	
	
	
	//========================= Deleted Data===================
/*	
	@DeleteMapping("/deleteAttendence/{id}")
	public void deleteAttendence(@PathVariable int id)
	{
		attendenceService.deleteAttendence(id);
		System.out.println("deleted attendence");		
	}
*/
	//------------------Using ResponseEntity--------------------
	@DeleteMapping("/deleteAttendence/{id}")
	public ResponseEntity<String> deleteAttendence(@PathVariable int id)
	{
		String a1=attendenceService.deleteAttendence(id);
		return ResponseEntity.ok(a1);		
	}
}
