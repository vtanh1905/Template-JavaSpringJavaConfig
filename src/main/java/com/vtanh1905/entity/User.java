package com.vtanh1905.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String username;

	private String password;

	@Column(name = "role_id")
	private int role_id;
	
	@ManyToOne
	@JoinColumn(name = "role_id", insertable = false, updatable = false)
	private Role role;

	public User(int id, String username, String password, int role_id) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role_id = role_id;
	}
	
	
}
