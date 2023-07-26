package com.example.entity;

import java.sql.Blob;
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
@Table(name = "Co_Notices")
public class CoNoticesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noticeId;
	private Integer caseNumber;
	private String edTraceID;
	private Blob coPdf;
	private Date printDate;
	private String noticeStatus;
	
	@CreationTimestamp
	private LocalDate createdDate;
}
