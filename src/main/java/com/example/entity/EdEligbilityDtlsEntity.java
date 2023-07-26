package com.example.entity;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Ed_Eligbility_Dtls")
public class EdEligbilityDtlsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer edTraceId;
	
	private String planName;
	private String planStatus;
	private Date eligStartDate;
	private Date eligEndDate;
	private Long benfitAmt;
	private String denailReason;
	private Integer caseNumber;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	

}
