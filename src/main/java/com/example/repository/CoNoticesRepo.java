package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.CoNoticesEntity;

public interface CoNoticesRepo extends JpaRepository<CoNoticesEntity, Integer> {

}
