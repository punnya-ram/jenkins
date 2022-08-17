package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employeedetails;

public interface EmployeeRepository extends JpaRepository<Employeedetails, Integer> {

}
