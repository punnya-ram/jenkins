package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDetails;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
	private UserRepository repo;
	@Autowired
	public UserService(UserRepository repo) {
		super();
		this.repo=repo;
	}
	public Optional<UserDetails> findById(int id){
		return repo.findById(id);
	}

	public List<UserDetails> findAll(){
		return repo.findAll();
	}



	public UserDetails saveOrUpdate(UserDetails entity) {
			return repo.save(entity);
	}


	


}
