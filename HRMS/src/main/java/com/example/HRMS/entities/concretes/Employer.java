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
@Table(name="employer")
public class Employer {
	
	@Id
	@Column(name="user_id", nullable = false)
	private Integer userId;
	
	@Column(name="company_name", nullable = false)
	private String companyName;
	
	@Column(name="phone_number", nullable = false)
	private String phoneNumber;
	
	@Column(name="web_site", nullable = false)
	private String webSite;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "id", referencedColumnName = "id",unique = true, nullable = false)
    private User user;
	

}
