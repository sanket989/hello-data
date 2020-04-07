package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.ServiceI;

@RestController
public class Homecontroller 
{
	@Autowired
	ServiceI s;
	
	@PostMapping("/reg")
	public Student register(@RequestBody Student stu)
	{
		
		s.savedata(stu);
		return stu;
		
	}

}
