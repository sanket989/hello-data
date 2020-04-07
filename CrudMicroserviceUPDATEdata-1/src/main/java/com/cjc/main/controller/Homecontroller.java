package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.serviceI;

@RestController
public class Homecontroller
{
	@Autowired
	serviceI s;
	 @RequestMapping("/edit/{sid}")
	 public Student ed(@PathVariable("sid") int sid)
	 {
		 System.out.println(sid);
		 s.editStudent(sid);
		  Student emp=s.editStudent(sid);
		 
		return emp;
		
		 
	 }

	 @RequestMapping("/update")
	 public Student up(@RequestBody Student stu)
	 {
		
		 Student stu1=s.updateStudent(stu);
	
		 return stu1;
	 }

	

	

}
