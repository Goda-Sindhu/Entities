package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Ies_User")
public class IesUserEntity {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer userId;
	
	private String fullName;
	private String emailId;
	private String pass;
	private Long phone;
	private LocalDate dob;
	private Integer ssno;
	private String gender;
	private String activeStatus;
	private String activeSwitch;
	
	private Integer roleId;
	
	@CreatedDate
	private LocalDate createDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	
	
	
}
