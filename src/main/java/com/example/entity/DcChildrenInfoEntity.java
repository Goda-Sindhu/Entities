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
@Table(name = "Dc_Children_Info")
public class DcChildrenInfoEntity {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long childId;
	private String childName;
	private Date childDob;
	private Integer childSsn;
	private Integer caseNumber;

}
