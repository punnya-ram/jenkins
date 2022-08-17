package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SkillReference;
import com.example.demo.service.SkillReferenceService;


@RestController
@RequestMapping(path="/api/v1/skilldetails")
public class SkillReferenceController {
	@Autowired
	private SkillReferenceService service;
	
	@PostMapping(path = "add")
	public SkillReference saveOrUpdate(@RequestBody SkillReference entity) {
		return this.service.saveOrUpdate(entity);
	}
	
	@GetMapping
	public List<SkillReference> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public SkillReference findById(@PathVariable("id") int id) {
		return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}

}
