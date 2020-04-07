package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.cjc.main.model.Student;

public interface Repository extends CrudRepository<Student, Integer> {

}
