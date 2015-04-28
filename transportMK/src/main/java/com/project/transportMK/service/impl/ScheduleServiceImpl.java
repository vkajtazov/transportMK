package com.project.transportMK.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.Schedule;
import com.project.transportMK.repository.ScheduleRepository;
import com.project.transportMK.service.ScheduleService;

@Service
public class ScheduleServiceImpl extends
		SimpleBaseEntityCrudServiceImpl<Schedule, ScheduleRepository> implements
		ScheduleService {

	@Autowired
	private ScheduleRepository repository;
	
	@Override
	protected ScheduleRepository getRepository() {
		return repository;
	}

}
