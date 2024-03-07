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

import com.model.Guardian;
import com.model.Hostel;
import com.service.Guardian_Service;
import com.service.Hostel_Service;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GuardianController 
{
	@Autowired
	Guardian_Service guardianService;
	//=========================Save Data===================

	//------------------Using ResponseEntity--------------------
	@PostMapping("/addGuardian")
	public ResponseEntity<Guardian> saveGaurdian(@RequestBody Guardian g)
	{
		Guardian g1=guardianService.saveGuardian(g);	
		return ResponseEntity.status(HttpStatus.CREATED).header("Add Guardian", "Guardian created").body(g1);
	}
	
	
	
	
	//========================= Get One Data===================

	//------------------Using ResponseEntity--------------------
	@GetMapping("/getOneGuardian/{id}")
	public ResponseEntity<Guardian> getOneGuardian(@PathVariable int id)
	{
		Guardian g1=guardianService.getOneGuardian(id);
		return ResponseEntity.ok(g1);
	}
	
	
	
	

	//------------------Using ResponseEntity--------------------
	@GetMapping("/getAllGuardian")
	public ResponseEntity<List<Guardian>> getAllGuardian(@RequestBody Guardian g)
	{
		List<Guardian> g1=guardianService.getAllGuardian(g);
		return ResponseEntity.ok(g1);
	}
		
	//========================= Update Data===================

	//------------------Using ResponseEntity--------------------
	@PutMapping("/updateGuardian")
	public ResponseEntity<Guardian> updateGuardian(@RequestBody Guardian g) {
		Guardian g1=guardianService.updateGuardian(g);
		return ResponseEntity.ok(g1);
	}

	//========================= Delete Data===================

	//------------------Using ResponseEntity--------------------
	@DeleteMapping("/deleteGuardian/{id}")
	public String deleteGuardian(@PathVariable int id) 
	{
		String g1=guardianService.deleteGuardian(id);
		return "Guardian deleted";
	}
	


	//------------------Using ResponseEntity--------------------
	@GetMapping("/searchGuardianName/{guardian_name}")
	public ResponseEntity<List<Guardian>> findBystud_first_name(@PathVariable String guardian_name)
	{
		System.out.println(guardian_name);
		System.out.println(guardianService.findByGuardian_name(guardian_name));
		List<Guardian> g1=guardianService.findByGuardian_name(guardian_name);
		return ResponseEntity.ok(g1);
	}
}
