package com.service;

import java.util.List;


import com.model.Payment;

public interface Payment_Service 
{
	public Payment savePayment(Payment p);
	
	public Payment getOnePayment(int id);
	
	public List<Payment> getAllPayment(Payment p);
	
	public Payment updatePayment(Payment p);
	
	public String deletePayment(int id);


}
