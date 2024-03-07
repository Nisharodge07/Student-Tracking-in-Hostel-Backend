package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudLoginRepo;
import com.model.StudentLogin;
@Service
public class StudLoginImpl implements StudentLoginService 
{
	@Autowired
	StudLoginRepo studLogRepo;
	
	@Override
	public StudentLogin saveStudLogin(StudentLogin s) {
		
		return studLogRepo.save(s);
	}

}
