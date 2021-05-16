package com.example.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HRMS.business.abstracts.EmployeeService;
import com.example.HRMS.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeeService employeeService;

	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/get-all")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	

}
