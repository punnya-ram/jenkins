package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="punnu_emp_details")
public class Employeedetails {
	@Id
	@Column(name="emp_id")
	int empId;
	@Column(name="emp_name")
	String empName;
	@OneToOne(cascade = CascadeType.ALL,targetEntity = EmployeeDesignation.class)
	@JoinColumn(name = "empdesign_id",referencedColumnName ="empdesign_id")
	EmployeeDesignation empdesignId;
	@Column(name="date_of_joining")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate dateOfJoining;

}
