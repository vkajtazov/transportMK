package com.project.transportMK.service;

import java.util.List;

import com.project.transportMK.model.Schedule;

public interface ScheduleService extends BaseEntityCrudService<Schedule> {
	public List<Schedule> findAllCityBus();
}
