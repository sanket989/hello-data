package com.cjc.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.Repository;
import com.cjc.main.service.Servicei;

@Service
public class Serviceimpl implements Servicei
{
	@Autowired
	Repository r;

	@Override
	public List<Student> logincheck(String uname, String pass) 
	{
		if(uname.equals("admin")&&pass.equals("admin"))
		{

			List<Student> st=(List<Student>)r.findAll();
			return st;
		
		}
		else
		{
			List<Student> list=r.findByUsernameAndPassword(uname, pass);	
			return list;
		}
			
	}

}
