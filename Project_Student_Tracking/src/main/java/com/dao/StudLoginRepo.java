package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.StudentLogin;

public interface StudLoginRepo extends JpaRepository<StudentLogin, Integer>
{

	

}
