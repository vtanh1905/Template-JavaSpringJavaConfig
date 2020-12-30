package com.vtanh1905.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.vtanh1905.entity.Role;
import com.vtanh1905.repository.RoleRepository;

@Repository
@Transactional(rollbackOn = Exception.class)
public class RoleRepositoryImpl extends BaseRepositoryImpl<Role, Integer> implements RoleRepository {

	public RoleRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Role.class);
	}

}
