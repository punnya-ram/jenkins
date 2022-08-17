package com.example.demo;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="punnya_transcation_log")
public class Transcationlog {
	@Id
	@Column(name="transcation_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int transcationId;
	@Column(name="user_id")
	int userId;
	@Column(name="application_operation_name")
	String applicationoperationname;
	@Column(name="request")
	String request;
	@Column(name="response")
	String response;
	LocalDate createdDate;
	@Column(name="created_by")
	String createdBy;
	@Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Transcationlog.class)
	@JoinColumn(name = "userId",referencedColumnName ="userId")
	Transcationlog userId;

	

}
