package com.example.HRMS.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_worker")
public class SystemWorker {
	
	@Id
	@Column(name="user_id", nullable = false)
	private Integer userId;
	
	@Column(name="title", nullable = false)
	private String title;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "id", referencedColumnName = "id",unique = true, nullable = false)
    private User user;

}
