package com.example.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Benefit_Issuance")
public class BenefitIssuanceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer benefitId;

	private Integer caseNumber;

	private String benefitMonthYear;
	private double benefitAmount;
	private Date transactionDate;
	private String transactionStatus;

}
