package com.example.HRMS.business.abstracts;

import java.util.List;

import com.example.HRMS.entities.concretes.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();

}
