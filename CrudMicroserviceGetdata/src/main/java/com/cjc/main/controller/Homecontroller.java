package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.main.model.Student;
import com.cjc.main.service.Servicei;

@RestController
public class Homecontroller
{
	@Autowired
	Servicei s;
	@GetMapping("/log/{username}/{password}")
	public List<Student> logincheck(@PathVariable ("username") String uname ,@PathVariable ("password") String pass )
	{
		
		
	List l=s.logincheck(uname, pass);
		
		
		return l;
	
		
		
	 }


}
