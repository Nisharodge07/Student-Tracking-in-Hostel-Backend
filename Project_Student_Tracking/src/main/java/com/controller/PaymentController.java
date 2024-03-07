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

import com.model.Payment;
import com.service.Payment_Service;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PaymentController 
{

	@Autowired
	Payment_Service paymentService;
	
	//=========================Save Data===================
/*	
	@PostMapping("/addPayment")
	public Payment savePayment(@RequestBody Payment p)
	{
		return paymentService.savePayment(p);
	}
*/
	//------------------Using ResponseEntity--------------------
	@PostMapping("/addPayment")
	public ResponseEntity<Payment> savePayment(@RequestBody Payment p)
	{
		Payment p1=paymentService.savePayment(p);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add Payment","Payment created").body(p1);
	}
	
	//========================= Get One  Data===================
/*	
	@GetMapping("/getOnePayement/{id}")
	public Payment getOnePayment(@PathVariable int id)
	{
		return paymentService.getOnePayment(id);
		
	}
*/
	//------------------Using ResponseEntity--------------------
	@GetMapping("/getOnePayement/{id}")
	public ResponseEntity<Payment> getOnePayment(@PathVariable int id)
	{
		Payment p1=paymentService.getOnePayment(id);
		return ResponseEntity.ok(p1);	
	}
	
	
	//========================= Get All Data===================
/*
	@GetMapping("getAllPayment")
	public List<Payment> getAllPayment(@RequestBody Payment p)
	{
		return paymentService.getAllPayment(p);	
	}
*/
	//------------------Using ResponseEntity--------------------
	@GetMapping("getAllPayment")
	public ResponseEntity<List<Payment>> getAllPayment(@RequestBody Payment p)
	{
		List<Payment> p1=paymentService.getAllPayment(p);	
		return ResponseEntity.ok(p1);
	}
	
	
	//========================= Update Data===================
/*	
	@PutMapping("/updatePayment")
	public Payment updatePayment(@RequestBody Payment p)
	{
		return paymentService.updatePayment(p);	
	}
*/
	//------------------Using ResponseEntity--------------------
	@PutMapping("/updatePayment")
	public ResponseEntity<Payment> updatePayment(@RequestBody Payment p)
	{
		Payment p1=paymentService.updatePayment(p);	
		return ResponseEntity.ok(p1);
	}
	
	
	//========================= Delete Data===================
/*	
	@DeleteMapping("/deletePayment/{id}")
	public void deletePayment(@PathVariable int id)
	{
		paymentService.deletePayment(id);
		System.out.println("delete payment");
	}
*/
	//------------------Using ResponseEntity--------------------
	@DeleteMapping("/deletePayment/{id}")
	public ResponseEntity<String> deletePayment(@PathVariable int id)
	{
		String p1=paymentService.deletePayment(id);
		
		return ResponseEntity.ok(p1);
	}
}
