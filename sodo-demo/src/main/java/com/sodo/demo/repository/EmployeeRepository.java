package com.sodo.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sodo.demo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	List<Employee> findByNameLike(String name);

}
