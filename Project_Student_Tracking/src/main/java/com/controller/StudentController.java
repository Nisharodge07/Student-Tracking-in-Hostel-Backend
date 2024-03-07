package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class StudentController 
{
	@Autowired
	StudentService studService;
	//=========================Save Data===================
	
	
	/*
	@PostMapping("/addStudent")
	public Student saveStudent(@RequestBody Student s)
	{
		return studService.saveStudent(s);
	}
	*/
	//-------Using Response Entity--------------
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student s)
	{
		Student s1= studService.saveStudent(s);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "Student created").body(s1);
	}
	
	
	
	//=========================Get One Data By Id===================

	
	/*
	@GetMapping("/getOneStud/{id}")
	public Student getOneStud(@PathVariable int id)
	{
		return studService.getOneStud(id);
	}
	*/	
	//-------Using Response Entity--------------
	@GetMapping("/getOneStud/{id}")
	public ResponseEntity<Student>  getOneStud(@PathVariable int id)
	{
		Student s1=studService.getOneStud(id);
		return ResponseEntity.ok(s1);
	}
	
	
	
	//=========================Get All Data ===================
	/*
	@GetMapping("/getAllstud")
	public List<Student> getAllStudent( Student s)
	{
		return studService.getAllStudent(s);
	}
	*/
	//-------Using Response Entity--------------
	@GetMapping("/getAllstud")
	public ResponseEntity<List<Student>>  getAllStudent( Student s)
	{
		List<Student> s1=studService.getAllStudent(s);
		return ResponseEntity.ok(s1);
	}
	
	
	
	//========================= Update Data ===================
	/*
	@PutMapping("/updateStud")
	public Student updateStud(@RequestBody Student s)
	{
		return studService.updateStud(s);
	}
	*/
	//-------Using Response Entity--------------
	@PutMapping("/updateStud")
	public ResponseEntity<Student>  updateStud(@RequestBody Student s)
	{
		Student s1=studService.updateStud(s);
		return ResponseEntity.ok(s1);
	}
	
	
	
	
	//========================= Delete Data ===================
	/*
	@DeleteMapping("/deleteStud/{id}")
	public void deleteStud(@PathVariable int id)
	{
			studService.deleteStud(id);	
	}
	*/
	//-------Using Response Entity--------------
	@DeleteMapping("/deleteStud/{id}")
	public ResponseEntity<String>  deleteStud(@PathVariable int id)
	{
		String s1=studService.deleteStud(id);
		return ResponseEntity.ok(s1);	
	}
	
	
	
	
	
	
	
	
	//find by email
	
	@GetMapping("/searchEmail/{stud_email}")
	public Student findByEmail(@PathVariable String stud_email)
	{
		System.out.println(stud_email);
		System.out.println(studService.findByEmail(stud_email));
		return studService.findByEmail(stud_email);
	}
	
	
	@GetMapping("/searchStudentName/{studFirstName}")
	public List<Student> findBystudFirstName(@PathVariable String studFirstName)
	{
		System.out.println(studFirstName);
		System.out.println(studService.findBystudFirstName(studFirstName));
		return studService.findBystudFirstName(studFirstName);
	}
	
	
	
	@GetMapping("/getStudByEmail/{stud_email}")
	public Student getByEmail(@PathVariable String stud_email)
	{
		return studService.getByEmail(stud_email);
	}
	
}
