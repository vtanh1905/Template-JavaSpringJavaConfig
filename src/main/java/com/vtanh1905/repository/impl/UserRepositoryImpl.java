package com.vtanh1905.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.vtanh1905.entity.User;
import com.vtanh1905.repository.UserRepository;

@Repository
@Transactional(rollbackOn = Exception.class)
public class UserRepositoryImpl extends BaseRepositoryImpl<User, Integer> implements UserRepository {

//	private SessionFactory sessionFactory; // Using when needing
	
	public UserRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, User.class); // it will use the common sessionFactory
//		this.sessionFactory = sessionFactory;
	}
}
