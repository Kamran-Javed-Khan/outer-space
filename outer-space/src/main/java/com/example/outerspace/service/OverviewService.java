package com.example.outerspace.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.example.outerspace.model.SolarSystem;

@Service
public interface OverviewService extends JpaRepository<SolarSystem, Integer> {

}
