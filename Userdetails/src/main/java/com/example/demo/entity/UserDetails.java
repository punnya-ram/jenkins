package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

@Table(name="punnya_userdetails")
public class UserDetails {
	@Id
	@Column(name="user_id")
	int userId;
	@Column(name="user_name")
	String userName;
	@Column(name="user_password")
	String password;
	@Column(name="frist_name")
	String fristName;
	@Column(name="last_name")
	String lastName;
	@Column(name="created_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdDate;
	@Column(name="created_by")
	String createdBy;
	@Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;
	@Column(name="token")
	String token;
	
	

	

}
