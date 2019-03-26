package com.sodo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sodo.demo.model.Employee;
import com.sodo.demo.service.EmployeeService;

@RestController
@RequestMapping(value = "/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/all-employee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {
		return new ResponseEntity<Employee>(service.getById(id), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Void> createEmployee(@RequestBody Employee employee) {
		service.create(employee);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Void> removeEmployee(@PathVariable String id) {
		service.delete(id);;
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
