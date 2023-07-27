package com.example.entity;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
		
	@CreationTimestamp
	private LocalDate createdDate;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private IesUserEntity user;
		
	
	@OneToMany(mappedBy = "citizen", cascade=CascadeType.ALL, fetch=FetchType.EAGER,orphanRemoval=true)
	private List<DcChildrenInfoEntity> child;
	
	@OneToOne(mappedBy = "education", cascade = CascadeType.ALL)
	private DcEducationEntity edu;
	
	@OneToOne(mappedBy = "income", cascade = CascadeType.ALL)
	private DcIncomeEntity income;
	
	@OneToOne(mappedBy = "planselect", cascade = CascadeType.ALL)
	private DCPlanSelectionEntity planSelect;
	
	@OneToOne(mappedBy = "eligibility", cascade=CascadeType.ALL, fetch=FetchType.EAGER,orphanRemoval=true)
	private EdEligbilityDtlsEntity elegId;

}
