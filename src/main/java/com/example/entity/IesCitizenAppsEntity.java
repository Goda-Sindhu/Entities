package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Ies_Citizen_Apps")
public class IesCitizenAppsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseNumber;
	private String name;
	private String emailId;
	private Long phone;
	private LocalDate dob;
	private Integer ssno;
	private String stateName;
	private String cityName;
	private String houseNo;
	private String createdBy;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	
	
}
