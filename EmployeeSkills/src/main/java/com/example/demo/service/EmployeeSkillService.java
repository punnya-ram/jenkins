package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmpolyeeSkills;
import com.example.demo.repo.EmployeeSkillRepository;


@Service
public class EmployeeSkillService {
	
	private EmployeeSkillRepository repo;
   @Autowired
	public EmployeeSkillService(EmployeeSkillRepository repo) {
		super();
		this.repo=repo;
	}

public Optional<EmpolyeeSkills> findById(int id){
	return repo.findById(id);
}

public List<EmpolyeeSkills> findAll(){
	return repo.findAll();
}



public EmpolyeeSkills saveOrUpdate(EmpolyeeSkills entity) {
		return repo.save(entity);
}


public List<EmpolyeeSkills> getBySkillNameAndExperience(String skillName,double skillExperiance){
	
	return this.repo.getBySkillNameAndExperience(skillName, skillExperiance);
}
public List<EmpolyeeSkills> getByIdapprovedAndStatus(int empId,String approvedBy,String status){
	
	return this.repo.getByIdapprovedAndStatus(empId, approvedBy,status);
}


}
