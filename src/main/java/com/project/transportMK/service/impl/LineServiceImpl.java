package com.project.transportMK.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.Line;
import com.project.transportMK.repository.LineRepository;
import com.project.transportMK.service.LineService;

@Service
public class LineServiceImpl extends
		SimpleBaseEntityCrudServiceImpl<Line, LineRepository> implements
		LineService {

	@Autowired
	private LineRepository repository;

	@Override
	protected LineRepository getRepository() {
		return repository;
	}

	@Override
	public Line findByLineName(String lineName) {
		return repository.findByLineName(lineName);
	}

}
