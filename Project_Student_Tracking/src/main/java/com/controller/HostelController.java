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

import com.model.Hostel;
import com.model.Student;
import com.service.Hostel_Service;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HostelController
{
		@Autowired
		Hostel_Service hostelService;
		
		//=========================Save Data===================
		
/*		
		@PostMapping("/addHostel")
		public Hostel saveHostel(@RequestBody Hostel hostel)
		{
			return hostelService.saveHostel(hostel);
		}
*/
		//------------------Using ResponseEntity--------------------
		@PostMapping("/addHostel")
		public ResponseEntity<Hostel> saveHostel(@RequestBody Hostel hostel)
		{
			Hostel h1= hostelService.saveHostel(hostel);
			return ResponseEntity.status(HttpStatus.CREATED).header("Add Hostel", "Hostel Created").body(h1);
		}
		
		
		
		
		//========================= Get One Data===================

		
/*		
		@GetMapping("/getOneHostel/{id}")
		public Hostel getOneHostel(@PathVariable int id)
		{
			return hostelService.getOneHostel(id);
		}
*/
		//------------------Using ResponseEntity--------------------
		@GetMapping("/getOneHostel/{id}")
		public ResponseEntity<Hostel> getOneHostel(@PathVariable int id)
		{
			Hostel h1= hostelService.getOneHostel(id);
			return ResponseEntity.ok(h1);
		}
		
		
		
		
		//=========================Get All Data===================

/*		
		@GetMapping("/getAllHostel")
		public List<Hostel> getAllHostel( Hostel h)
		{
			return hostelService.getAllHostel(h);
		}
*/
		//------------------Using ResponseEntity--------------------
		@GetMapping("/getAllHostel")
		public ResponseEntity<List<Hostel>> getAllHostel( Hostel h)
		{
			List<Hostel> h1=hostelService.getAllHostel(h);
			return ResponseEntity.ok(h1);
		}
		
		
		
		//=========================Update Data===================

/*		
		@PutMapping("/updateHostel")
		public Hostel updateHostel(@RequestBody Hostel h)
		{
			return hostelService.updateHostel(h);
		}
*/
		//------------------Using ResponseEntity--------------------
		@PutMapping("/updateHostel")
		public ResponseEntity<Hostel> updateHostel(@RequestBody Hostel h)
		{
			Hostel h1=hostelService.updateHostel(h);
			return ResponseEntity.ok(h1);
		}
		
		
		
		//=========================Delete Data===================

/*		
		@DeleteMapping("/deleteHostel/{id}")
		
		public void deleteHostel(@PathVariable int id)
		{
			hostelService.deleteHostel(id);
		}
*/
		//------------------Using ResponseEntity--------------------
		@DeleteMapping("/deleteHostel/{id}")	
		public ResponseEntity<String> deleteHostel(@PathVariable int id)
		{
			String h1=hostelService.deleteHostel(id);
			return ResponseEntity.ok(h1);
		}

		
		
		
		//=========================Search Data By Name ===================

/*
		@GetMapping("/searchHostelName/{hostel_name}")
		public List<Hostel> findBystud_first_name(@PathVariable String hostel_name)
		{
			System.out.println(hostel_name);
			System.out.println(hostelService.findByHostel_name(hostel_name));
			
			return hostelService.findByHostel_name(hostel_name);
		}
*/
		//------------------Using ResponseEntity--------------------
		@GetMapping("/searchHostelName/{hostel_name}")
		public ResponseEntity<List<Hostel>> findBystud_first_name(@PathVariable String hostel_name)
		{
			System.out.println(hostel_name);
			System.out.println(hostelService.findByHostel_name(hostel_name));
			List<Hostel> h1=hostelService.findByHostel_name(hostel_name);
			return ResponseEntity.ok(h1);
		}
}
