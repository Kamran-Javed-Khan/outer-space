package com.example.outerspace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.outerspace.model.SolarSystem;
import com.example.outerspace.service.OverviewService;

@RestController
@CrossOrigin("http://localhost:4200")
public class OverviewController {
	
	@Autowired
	OverviewService overviewService;

	@GetMapping("/overview")
	public List<SolarSystem> getSolarSystem() {
		return overviewService.findAll();
	}
}
