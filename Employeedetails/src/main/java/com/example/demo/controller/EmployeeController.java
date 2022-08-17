package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.example.demo.entity.Employeedetails;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path="/api/v1/empdetails")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping
	public Employeedetails saveOrUpdate(@RequestBody Employeedetails entity) {
		return this.service.saveOrUpdate(entity);
	}
	
	@GetMapping
	public List<Employeedetails> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Employeedetails findById(@PathVariable("id") int id) {
		return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}
	
}
