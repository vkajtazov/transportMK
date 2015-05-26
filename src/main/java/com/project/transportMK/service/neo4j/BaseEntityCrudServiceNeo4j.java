package com.project.transportMK.service.neo4j;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.neo4j.conversion.Result;

import com.project.transportMK.model.BaseEntity;

public interface BaseEntityCrudServiceNeo4j<T extends BaseEntity> {

	public T save(T entity);

	public Iterable<T> save(Iterable<T> entities);

	public Result<T> findAll();

	public Page<T> findAll(Pageable pageable);

	public Result<T> findAll(Sort sort);

	public Result<T> findAll(Iterable<Long> ids);

	public Result<T> findAll(Specification<T> spec);

	public Page<T> findAll(Specification<T> spec, Pageable pageable);

	public List<T> findAll(Specification<T> spec, Sort sort);

	public long count();

	public long count(Specification<T> spec);

	public T findOne(Long id);

	public T findOne(Specification<T> spec);

	public boolean exists(Long id);

	public void delete(Long id);

	public void delete(T entity);

	public void delete(Iterable<T> entities);

	public void deleteAll();

}
