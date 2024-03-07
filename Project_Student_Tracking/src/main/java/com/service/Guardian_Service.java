package com.service;

import java.util.List;

import com.model.Guardian;
import com.model.Student;


public interface Guardian_Service
{
	public Guardian saveGuardian(Guardian g);
	
	public Guardian getOneGuardian(int id);
	
	public List<Guardian> getAllGuardian(Guardian g);
	
	public Guardian updateGuardian(Guardian g);
	
	public String deleteGuardian(int id);
	
	public List<Guardian> findByGuardian_name(String guardian_name);
}
