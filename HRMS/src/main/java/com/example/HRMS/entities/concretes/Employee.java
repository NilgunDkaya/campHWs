package com.example.HRMS.entities.concretes;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="user_id", nullable = false)
	private Integer userId;
	
	@Column(name="first_name", nullable = false)
	private String firstName;
	
	@Column(name="last_name", nullable = false)
	private String lastName;
	
	@Column(name="identity_number", nullable = false, unique = true)
	private String identityNumber;
	
	@Column(name="birth_date", nullable = false)
	private Date birthDate;
	
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "id", referencedColumnName = "id",unique = true, nullable = false)
    private User user;

}
