package com.project.transportMK.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.Subline;
import com.project.transportMK.repository.SublineRepository;
import com.project.transportMK.service.SublineService;

@Service
public class SublineServiceImpl extends
		SimpleBaseEntityCrudServiceImpl<Subline, SublineRepository> implements
		SublineService {

	@Autowired
	private SublineRepository repository;
	
	@Override
	protected SublineRepository getRepository() {
		return repository;
	}

}
