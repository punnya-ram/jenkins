package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

@Table(name="punnya_empskills")
public class EmpolyeeSkills {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="emp_skill_id")
	int empskillId;
	@Column(name="emp_id")
	int empId;
	@Column(name="skill_id")
	int skillId;
	@Column(name="skill_name")
	String skillName;
	@Column(name="skill_experiance")
	double skillExperiance;
	@Column(name="skill_status")
	String status;
	@Column(name="approved_by")
	String approvedBy;
	@Column(name="approved_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate approvedDate;
	@Column(name="created_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdDate;
	@Column(name="modified_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate modifiedDate;

	
}
