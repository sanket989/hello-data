package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.main.model.Student;
import com.cjc.main.repository.Repository;
import com.cjc.main.service.serviceI;

@Service
public class ServiceImpl implements serviceI 
{
	@Autowired
	Repository r;
	

	@Override
	public Student editStudent(int sid) 
	{
System.out.println(sid);
		
		Student stu =r.findById(sid).get();
		return stu;
			
	}

	@Override
	public Student updateStudent(Student s)
	{
		r.findAll();
		return r.save(s);
	}
		

}
