package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Guardian;


public interface Guardian_Repository extends JpaRepository<Guardian, Integer> 
{
	@Query("select g from Guardian g where g.guardian_name=:n")
	public List<Guardian> findByGuardian_name(@Param("n") String guardian_name);

}
