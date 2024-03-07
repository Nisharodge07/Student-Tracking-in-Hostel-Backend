package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Attendence;

public interface AttendenceRepository extends JpaRepository<Attendence, Integer>
{

}
