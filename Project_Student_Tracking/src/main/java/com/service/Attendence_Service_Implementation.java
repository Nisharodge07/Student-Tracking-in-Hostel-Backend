package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AttendenceRepository;
import com.model.Attendence;
import com.model.Guardian;

@Service
public class Attendence_Service_Implementation implements Attendence_Service 
{
	@Autowired
	AttendenceRepository attendenceRepo;

	@Override
	public Attendence saveAttendence(Attendence a)
	{
		
		return attendenceRepo.save(a);
	}

	@Override
	public Attendence getOneAttendence(int id) 
	{
		
		return attendenceRepo.findById(id).orElse(null);
	}

	@Override
	public List<Attendence> getAllAttendence(Attendence a) {
	
		return attendenceRepo.findAll();
	}

	@Override
	public Attendence updateAttendence(Attendence a)
	{
		Attendence existingAttendence=attendenceRepo.findById(a.getAttendence_id()).orElse(null);
//		existingAttendence.setAttendence_date(a.getAttendence_date());
		existingAttendence.setAttendence_status(a.getAttendence_status());
//		existingAttendence.setStudent(a.getStudent());
		return attendenceRepo.save(existingAttendence);
	}

	@Override
	public String deleteAttendence(int id) 
	{
		attendenceRepo.deleteById(id);
		return "Deleted Attendence";
		
	}

}
