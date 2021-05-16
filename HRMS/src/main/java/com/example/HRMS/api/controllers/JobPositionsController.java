package com.example.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.JobPositionService;
import com.example.HRMS.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job-positions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;

	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/get-all")
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();
	}
	
	@PostMapping("/save")
	public JobPosition save(@RequestBody JobPosition jobPosition) {
		return jobPositionService.save(jobPosition);
	}

}
