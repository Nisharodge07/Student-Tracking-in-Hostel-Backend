package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Hostel;


public interface HostelRepository extends JpaRepository<Hostel, Integer>
{
	@Query("select s from Hostel s where s.hostel_name=:n")
	public List<Hostel> findByHostel_name(@Param("n") String hostel_name);

}
