package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserDetails;
import com.example.demo.service.UserService;


@RestController
@RequestMapping(path="/api/v1/userdetails")
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping(path="/add")
	public UserDetails saveOrUpdate(@RequestBody UserDetails entity) {
		return this.service.saveOrUpdate(entity);
	}
	
	@GetMapping
	public List<UserDetails> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public UserDetails findById(@PathVariable("id") int id) {
		return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}
	

}
