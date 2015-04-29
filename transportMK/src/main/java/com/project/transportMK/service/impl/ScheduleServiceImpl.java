package com.project.transportMK.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.transportMK.model.Schedule;
import com.project.transportMK.model.VehicleType;
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

	@Override
	public List<Schedule> findAllCityBus() {
		return repository.findByVehicleType(VehicleType.CITYBUS);
	}

}
