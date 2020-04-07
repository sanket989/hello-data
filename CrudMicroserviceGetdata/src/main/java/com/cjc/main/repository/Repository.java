package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.cjc.main.model.Student;

public interface Repository extends CrudRepository<Student,Integer>
{
	List<Student> findByUsernameAndPassword(String uname, String pass);
}
