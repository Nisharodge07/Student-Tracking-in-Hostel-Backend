package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Admin;
import com.service.AdminService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController 
{
	@Autowired
	AdminService admService;
	
	@PostMapping("/addadmin")
	public Admin addAdmin(@RequestBody Admin a) 
	{
		admService.saveAdmin(a);
		return a;
	}
	
	@GetMapping("/getAdmin/{id}")
	public Admin getOneAdmin(@PathVariable int id) 
	{
		
		return admService.getOneAdmin(id);
	}
	
	@DeleteMapping("/deleteAdmin/{adminId}")
	public void deleteById(@PathVariable int adminId)
	{
		admService.deleteById(adminId);
	}
	
	@PutMapping("updateAdmin")
	public Admin updateAdmin(@RequestBody Admin a) 
	{
		return admService.updateAdmin(a);
	}

}
