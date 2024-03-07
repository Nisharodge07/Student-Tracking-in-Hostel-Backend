package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService
{
	public Student saveStudent(Student s);
	
	public Student getOneStud(int id);
	
	public List<Student> getAllStudent(Student s);
	
	public Student updateStud(Student s);
	
	public String deleteStud(int id);

	public Student findByEmail(String stud_email);
	
	public List<Student> findBystudFirstName(String studFirstName);

	Student getByEmail(String stud_email);



}
