package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employeedetails;
import com.example.demo.repo.EmployeeRepository;



@Service
public class EmployeeService {

	private EmployeeRepository repo;
   
	@Autowired
	
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo=repo;
	}


	public Optional<Employeedetails> findById(int id){
		return repo.findById(id);
	}
	
	public List<Employeedetails> findAll(){
		return repo.findAll();
	}
	
	
	public Employeedetails saveOrUpdate(Employeedetails entity) {
		
	      return repo.save(entity);
	   }
	}
