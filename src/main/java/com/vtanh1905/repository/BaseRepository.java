package com.vtanh1905.repository;

import java.util.List;

public interface BaseRepository<T, E> {
	public List<T> findAll();

	public T findById(E id);

	public int saveOrUpdate(T element);

	public int delete(E id);
}
