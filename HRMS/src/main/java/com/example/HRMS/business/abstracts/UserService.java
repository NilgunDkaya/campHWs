package com.example.HRMS.business.abstracts;

import java.util.List;

import com.example.HRMS.entities.concretes.User;

public interface UserService {
	List<User> getAll();

}
