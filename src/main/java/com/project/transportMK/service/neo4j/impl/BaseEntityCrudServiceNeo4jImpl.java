package com.project.transportMK.service.neo4j.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.project.transportMK.model.BaseEntity;
import com.project.transportMK.service.neo4j.BaseEntityCrudServiceNeo4j;

public abstract class BaseEntityCrudServiceNeo4jImpl<T extends BaseEntity, R extends GraphRepository<T>>
		implements BaseEntityCrudServiceNeo4j<T> {

	protected abstract R getRepository();

	@Override
	public T save(T entity) {
		// TODO Auto-generated method stub
		return getRepository().save(entity);
	}

	@Override
	public Iterable<T> save(Iterable<T> entities) {
		return getRepository().save(entities);
	}

	@Override
	public Result<T> findAll() {
		return getRepository().findAll();
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return getRepository().findAll(pageable);
	}

	@Override
	public Result<T> findAll(Sort sort) {
		return getRepository().findAll(sort);
	}

	@Override
	public Result<T> findAll(Iterable<Long> ids) {
		return getRepository().findAll();
	}

	@Override
	public long count() {
		return getRepository().count();
	}

	@Override
	public long count(Specification<T> spec) {
		return 0;
	}

	@Override
	public T findOne(Long id) {
		return getRepository().findOne(id);
	}

	@Override
	public T findOne(Specification<T> spec) {
		return null;
	}

	@Override
	public boolean exists(Long id) {
		return getRepository().exists(id);
	}

	@Override
	public void delete(Long id) {
		getRepository().delete(id);
	}

	@Override
	public void delete(T entity) {
		getRepository().delete(entity);
	}

	@Override
	public void delete(Iterable<T> entities) {
		getRepository().delete(entities);
	}

	@Override
	public void deleteAll() {
		getRepository().deleteAll();
	}

}
