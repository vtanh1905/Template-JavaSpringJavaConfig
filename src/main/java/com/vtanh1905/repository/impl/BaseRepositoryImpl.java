package com.vtanh1905.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.vtanh1905.repository.BaseRepository;

public class BaseRepositoryImpl<T, E> implements BaseRepository<T, E> {

	private SessionFactory sessionFactory;
	
	private Class<T> entity;

	public BaseRepositoryImpl(SessionFactory sessionFactory, Class<T> entity) {
		this.sessionFactory = sessionFactory;
		this.entity = entity;
	}
	
	public List<T> findAll() {
		try {
			Session session = sessionFactory.openSession();
			Query<T> query = session.createQuery("From " + entity.getSimpleName(), entity);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public T findById(E id) {
		try {
			Session session = sessionFactory.openSession();
			return session.find(entity, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int saveOrUpdate(T element) {
		try {
			Session session = sessionFactory.openSession();
			session.saveOrUpdate(element);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(E id) {
		try {
			Session session = sessionFactory.openSession();
			T element = session.find(entity, id);
			session.delete(element);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
