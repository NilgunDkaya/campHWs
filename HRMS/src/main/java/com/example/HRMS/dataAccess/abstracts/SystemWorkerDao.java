package com.example.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HRMS.entities.concretes.SystemWorker;

public interface SystemWorkerDao extends JpaRepository<SystemWorker, Integer>{

}
