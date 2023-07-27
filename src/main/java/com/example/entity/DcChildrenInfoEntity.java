package com.example.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Dc_Children_Info")
public class DcChildrenInfoEntity {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long childId;
	private String childName;
	private Date childDob;
	private Integer childSsn;
	//private Integer caseNumber;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "case_number")
	private IesCitizenAppsEntity citizen;

}
