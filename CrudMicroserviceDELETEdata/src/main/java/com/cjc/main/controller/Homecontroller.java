package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.main.model.Student;
import com.cjc.main.service.ServiceI;

@RestController
public class Homecontroller
{
	@Autowired
	ServiceI s;
	
	@RequestMapping("/delete/{sid}")
	
	public Student del(@PathVariable("sid") int sid,Student stu)
	{
		 System.out.println(sid);
		 s.DeleteRecord(sid);
		 
		 
		return  stu; 
		
	}


}
