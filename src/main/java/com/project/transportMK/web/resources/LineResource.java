package com.project.transportMK.web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.Line;
import com.project.transportMK.model.Schedule;
import com.project.transportMK.service.LineService;

@RestController
@RequestMapping("/data/rest/lines")
public class LineResource extends CrudResource<Line, LineService> {

	@Autowired
	private LineService lineService;

	@Override
	public LineService getService() {
		return lineService;
	}

	@RequestMapping(value = "/schedules/{startStation}/{endStation}")
	public List<Schedule> getSchedulesByLine(@PathVariable long startStation,
			@PathVariable long endStation) {
		return lineService.findSchedulesByLine(startStation, endStation);
	}

}
