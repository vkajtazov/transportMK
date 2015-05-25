package com.project.transportMK.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.transportMK.service.CityService;
import com.project.transportMK.service.LineService;
import com.project.transportMK.service.ScheduleService;
import com.project.transportMK.service.StationService;
import com.project.transportMK.service.SublineService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private CityService cityService;
	
	@Autowired
	private LineService lineService;
	
	@Autowired
	private SublineService sublineService;
	
	@Autowired
	private ScheduleService scheduleService;
	
	@Autowired
	private StationService stationService;
	
}
