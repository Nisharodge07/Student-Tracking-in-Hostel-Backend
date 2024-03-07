package com.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	@Query("select s from Student s where s.studEmail=:e")
	public Student findByEmail(@Param ("e")String studEmail);
	
	
	
	
	
	@Query("select s from Student s where s.studFirstName=:n")
	public List<Student> findBystudFirstName(@Param("n") String studFirstName);
	
//	    Student findByEmail(String stud_email);

}