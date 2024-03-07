package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HostelRepository;
import com.model.Hostel;
import com.model.Student;
@Service
public class Hostel_Service_Implementation implements Hostel_Service 
{
		@Autowired
		HostelRepository hostelRepo;
	
	public Hostel saveHostel(Hostel hostel)
	{
		
		return hostelRepo.save(hostel);
	}
	
	
	@Override
	public List<Hostel> getAllHostel(Hostel h) {
		
		return hostelRepo.findAll();
	}

	@Override
	public Hostel updateHostel(Hostel h) {
		Hostel exstingHostel =hostelRepo.findById(h.getHostel_id()).orElse(null);
		exstingHostel.setHostel_name(h.getHostel_name());
		
		return hostelRepo.save(exstingHostel);
	}

	@Override
	public String deleteHostel(int id) {
		
		 hostelRepo.deleteById(id);
		 return "deleted student";
	}

	@Override
	public Hostel getOneHostel(int id) {
		
		return hostelRepo.findById(id).orElse(null);
	}


	@Override
	public List<Hostel> findByHostel_name(String hostel_name) {
		
		return hostelRepo.findByHostel_name(hostel_name);
	}

}
