package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmpolyeeSkills;
import com.example.demo.service.EmployeeSkillService;

@RestController
@RequestMapping(path="/api/v1/empskilldetails")
public class EmployeeSkillController {
	@Autowired
	private EmployeeSkillService service;
	@PostMapping
	public EmpolyeeSkills saveOrUpdate(@RequestBody EmpolyeeSkills entity) {
		return this.service.saveOrUpdate(entity);
	}
	
	@GetMapping
	public List<EmpolyeeSkills> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public EmpolyeeSkills findById(@PathVariable("id") int id) {
		return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}
	@GetMapping(path = "/srch/{skillName}/{skillExperiance}")
	public List<EmpolyeeSkills> getBySkillNameAndExperience(@PathVariable("skillName") String skillName,@PathVariable("skillExperiance") double experience){
		
		return this.service.getBySkillNameAndExperience(skillName, experience);
	}

}
