package com.sodo.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sodo.demo.model.Employee;
import com.sodo.demo.repository.EmployeeRepository;
import com.sodo.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public List<Employee> getByName(String name) {
		return repository.findByNameLike(name);
	}

	@Override
	public List<Employee> getAll() {
		return repository.findAll();
	}

	@Override
	public void create(Employee employee) {
		repository.save(employee);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}


	@Override
	public Employee getById(String id) {
		return repository.findById(id).get();
	}

	
	
}
