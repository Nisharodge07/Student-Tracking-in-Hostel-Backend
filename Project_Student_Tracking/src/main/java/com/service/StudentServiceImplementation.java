package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Student;



@Service
public class StudentServiceImplementation implements StudentService
{
	@Autowired
	StudentRepository studRepo;
	
	public Student saveStudent(Student s) {
		
		return studRepo.save(s);
	}

	@Override
	public List<Student> getAllStudent(Student s) {
		
		return studRepo.findAll();
	}

	@Override
	public Student updateStud(Student s) {
		Student existingStud =studRepo.findById(s.getStudId()).orElse(null);
		existingStud.setStudFirstName(s.getStudFirstName());

		
		return studRepo.save(existingStud);
	}

	@Override
	public String deleteStud(int id) {
		
		 studRepo.deleteById(id);
		// System.out.println("deleted student");
		return "deleted student";
	}

	@Override
	public Student getOneStud(int id) {
		
		return studRepo.findById(id).orElse(null);
	}

	@Override
	public Student getByEmail(String stud_email) {
		
		return studRepo.findByEmail(stud_email);
	}



	@Override
	public Student findByEmail(String stud_email) {
		
		return studRepo.findByEmail(stud_email);
	}

	@Override
	public List<Student> findBystudFirstName(String studFirstName) {
		// TODO Auto-generated method stub
		return studRepo.findBystudFirstName(studFirstName);
	}
	

	
	
	
}
