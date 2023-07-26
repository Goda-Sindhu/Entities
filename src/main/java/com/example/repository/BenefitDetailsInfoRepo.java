package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.BenefitIssuanceEntity;

public interface BenefitDetailsInfoRepo extends JpaRepository<BenefitIssuanceEntity, Integer> {

}
