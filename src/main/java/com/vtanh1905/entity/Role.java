package com.vtanh1905.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	@OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
	private Set<User> users;

	public Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
	
}
