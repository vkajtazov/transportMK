package com.project.transportMK.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.Station;
import com.project.transportMK.repository.StationRepository;
import com.project.transportMK.service.StationService;

@Service
public class StationServiceImpl extends
		SimpleBaseEntityCrudServiceImpl<Station, StationRepository> implements
		StationService {

	@Autowired
	private StationRepository repository;
	
	@Override
	protected StationRepository getRepository() {
		return repository;
	}

}
