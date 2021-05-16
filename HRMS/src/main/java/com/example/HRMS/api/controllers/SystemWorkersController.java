package com.example.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.SystemWorkerService;
import com.example.HRMS.entities.concretes.SystemWorker;

@RestController
@RequestMapping("/api/system-workers")
public class SystemWorkersController {
	
	private SystemWorkerService systemWorkerService;

	public SystemWorkersController(SystemWorkerService systemWorkerService) {
		super();
		this.systemWorkerService = systemWorkerService;
	}
	
	@GetMapping("/get-all")
	public List<SystemWorker> getAll(){
		return systemWorkerService.getAll();
	}

}
