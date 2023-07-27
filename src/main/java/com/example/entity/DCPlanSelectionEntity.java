package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
@Table(name = "DC_Plan_Selection")
public class DCPlanSelectionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer selectionId;
	
	@OneToOne
	@JoinColumn(name="plan_id")
	private IesPlansEntity planid;
	
	@OneToOne
	@JoinColumn(name="case_number")
	private IesCitizenAppsEntity planselect;
}
