package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.Repository;
import com.cjc.main.service.ServiceI;

@Service
public class ServiceImpl implements ServiceI
{
	@Autowired
	Repository r;

	@Override
	public void savedata(Student s)
	{
		r.save(s);
		
		
		
	}
	
	
	
	

}
