package com.service;

import java.util.List;

import com.model.Hostel;
import com.model.Student;


public interface Hostel_Service 
{
	public Hostel saveHostel(Hostel hostel);
	
	public Hostel getOneHostel(int id);
	
	public List<Hostel> getAllHostel(Hostel h);
	
	public Hostel updateHostel(Hostel h);
	
	public String deleteHostel(int id);
	
	public List<Hostel> findByHostel_name(String hostel_name);

}
