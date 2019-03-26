package com.sodo.demo.service;

import java.util.List;

import com.sodo.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getByName(String name);
	
	List<Employee> getAll();
	
	void create(Employee employee);
	
	void delete(String id);
	
	Employee getById(String id);
	
}
