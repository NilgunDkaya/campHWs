package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.SystemWorkerService;
import com.example.HRMS.dataAccess.abstracts.EmployerDao;
import com.example.HRMS.dataAccess.abstracts.SystemWorkerDao;
import com.example.HRMS.entities.concretes.SystemWorker;

@Service
public class SystemWorkerManager implements SystemWorkerService {
	
	private SystemWorkerDao systemWorkerDao;
	
	@Autowired
	public SystemWorkerManager(SystemWorkerDao systemWorkerDao) {
		super();
		this.systemWorkerDao = systemWorkerDao;
	}

	@Override
	public List<SystemWorker> getAll() {
		
		return systemWorkerDao.findAll();
	}

}
