package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.EmployeeService;
import com.example.HRMS.dataAccess.abstracts.EmployeeDao;
import com.example.HRMS.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		
		return employeeDao.findAll();
	}

}
