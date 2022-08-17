package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.SkillReference;

import com.example.demo.repo.SkillReferenceRepository;



@Service
public class SkillReferenceService {
	private SkillReferenceRepository repo;
@Autowired
	
	public SkillReferenceService(SkillReferenceRepository repo) {
		super();
		this.repo=repo;
	
}


public Optional<SkillReference> findById(int id){
	return repo.findById(id);
}

public List<SkillReference> findAll(){
	return repo.findAll();
}


public SkillReference saveOrUpdate(SkillReference entity) {
      return repo.save(entity);
   }


}
