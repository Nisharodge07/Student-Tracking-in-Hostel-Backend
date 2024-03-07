package com.service;

import java.util.List;

import com.model.Attendence;
import com.model.Guardian;

public interface Attendence_Service 
{
	public Attendence saveAttendence(Attendence a);
	
	public Attendence getOneAttendence(int id);
	
	public List<Attendence> getAllAttendence(Attendence a);
	
	public Attendence updateAttendence(Attendence a);
	
	public String deleteAttendence(int id);

}
