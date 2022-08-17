package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDetails {
	
	int userId;
	
	String userName;
	String password;
	String fristName;
	String lastName;
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdDate;
	String createdBy;
    Date creationDateTime;
	String token;
	

	

}
