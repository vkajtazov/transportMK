package com.project.transportMK.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.transportMK.model.Schedule;
import com.project.transportMK.model.VehicleType;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
	
	public List<Schedule> findByVehicleType (VehicleType type);
}
