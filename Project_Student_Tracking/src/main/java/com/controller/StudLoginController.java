package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.StudentLogin;
import com.service.StudentLoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudLoginController 
{
	@Autowired
	StudentLoginService studLogin;
	
	@PostMapping("/addstudLogin")
	public StudentLogin addStudLogin(@RequestBody StudentLogin s)
	{
		return studLogin.saveStudLogin(s);
	}
}


