package com.project.transportMK.web;

import java.sql.Time;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.transportMK.model.CityBus;
import com.project.transportMK.model.Line;
import com.project.transportMK.model.RegularityType;
import com.project.transportMK.model.Schedule;
import com.project.transportMK.model.VehicleType;
import com.project.transportMK.service.LineService;
import com.project.transportMK.service.ScheduleService;

@RestController
@RequestMapping("/data/rest/insert")
public class InsertController {

	@Autowired
	private LineService lineService;
	@Autowired
	private ScheduleService scheduleService;

	@RequestMapping(value = "/cityBusList", method = RequestMethod.POST, headers = { "Content-type=application/json" })
	public void insertCityBus(@RequestBody List<CityBus> busList) {
		for (CityBus cityBus : busList) {
			insertCityBus(cityBus);
		}
	}

	private boolean insertCityBus(CityBus bus) {

		Line line = getLineByName(bus.getLineNumber());
		Schedule schedule = new Schedule();
		schedule.setLine(line);
		schedule.setDepartureTime(bus.getStartTime());
		schedule.setRegularityType(getRegularityTypeFromString(bus
				.getRegularity().name()));
		schedule.setVehicleType(VehicleType.CITYBUS);
		scheduleService.save(schedule);
		return true;
	}

	private Line getLineByName(String lineName) {

		Line line = lineService.findByLineName(lineName);
		if (line != null)
			return line;
		else {
			line = new Line();
			line.setLineName(lineName);
			lineService.saveAndFlush(line);
			return line;
		}
	}

	private Time getTimeFromString(String timeString) {
		return Time.valueOf(timeString);
	}

	private RegularityType getRegularityTypeFromString(String regString) {

		if (regString.equals("EveryDay")) {
			return RegularityType.EVERYDAY;
		} else if (regString.equals("Saturday")) {
			return RegularityType.SATURDAY;
		} else if (regString.equals("Sunday")) {
			return RegularityType.SUNDAY;
		} else if (regString.equals("Weekend")) {
			return RegularityType.WEEKEND;
		} else if (regString.equals("Workday")) {
			return RegularityType.WORKDAY;
		}
		return null;
	}
}
