package com.example.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="punnu_emp_designation")
public class EmployeeDesignation {
	@Id
	@Column(name="empdesign_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int empdesignId;
	@Column(name="empdesign_name")
	String empdesignName;
	
	

}
