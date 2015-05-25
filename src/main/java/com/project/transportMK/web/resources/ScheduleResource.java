package com.project.transportMK.web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Schedule;
import com.project.transportMK.service.ScheduleService;

@RestController
@RequestMapping("/data/rest/schedules")
public class ScheduleResource extends CrudResource<Schedule, ScheduleService>{

	@Autowired
	private ScheduleService scheduleService;
	
	@Override
	public ScheduleService getService() {
		return scheduleService;
	}

	@RequestMapping(value = "/cityBus", method = RequestMethod.GET, produces = "application/json")
	public List<Schedule> getCityBusSchedule(){
		return scheduleService.findAllCityBus();
	}
}
