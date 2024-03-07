package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PaymentRepository;
import com.model.Payment;

@Service
public class Payment_Service_Implementation implements Payment_Service 
{
	@Autowired
	PaymentRepository paymentRepo;
	
	
	public Payment savePayment(Payment p) {
		
		return paymentRepo.save(p);
	}


	@Override
	public Payment getOnePayment(int id) 
	{
		
		return paymentRepo.findById(id).orElse(null);
	}


	@Override
	public List<Payment> getAllPayment(Payment p)
	{
		
		return paymentRepo.findAll();
	}


	@Override
	public Payment updatePayment(Payment p)
	{
		Payment existingPayment=paymentRepo.findById(p.getPayment_id()).orElse(null);
		existingPayment.setPayment_type(p.getPayment_type());
		return paymentRepo.save(existingPayment);
	}


	@Override
	public String deletePayment(int id) 
	{
		paymentRepo.deleteById(id);
		return "Payment Deleted";
	}

}
