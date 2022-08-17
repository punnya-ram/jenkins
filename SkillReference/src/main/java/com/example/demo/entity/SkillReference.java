package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="punnu_skill_details")
public class SkillReference {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="skill_id")
	int skillId;
	@Column(name="skill_type")
	String skillType;
	@Column(unique=true,name="skill_name")
	String skillName;
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdDate;
	@Column(name="created_by")
	String createdBy;
	@Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;
	
	
	
	

}
