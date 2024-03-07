package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Guardian_Repository;
import com.model.Guardian;
@Service
public class Guardian_Service_Implementation implements Guardian_Service 
{
	@Autowired
	Guardian_Repository guardianRepo;
	
	@Override
	public Guardian saveGuardian(Guardian g) {
		
		return guardianRepo.save(g);
	}

	@Override
	public Guardian getOneGuardian(int id) {
		
		return guardianRepo.findById(id).orElse(null);
	}

	@Override
	public List<Guardian> getAllGuardian(Guardian g) {
		
		return guardianRepo.findAll();
	}

	@Override
	public Guardian updateGuardian(Guardian g) {
		Guardian existingGuardian=guardianRepo.findById(g.getGuardian_id()).orElse(null);
		existingGuardian.setGuardian_relation(g.getGuardian_relation());
		existingGuardian.setGuardian_name(g.getGuardian_name());
		return guardianRepo.save(existingGuardian);
	}

	@Override
	public String deleteGuardian(int id) 
	{
		guardianRepo.deleteById(id);
		return "Guardian deleted";
		
		
	}

	@Override
	public List<Guardian> findByGuardian_name(String guardian_name) {
		
		return guardianRepo.findByGuardian_name(guardian_name);
	}

}
