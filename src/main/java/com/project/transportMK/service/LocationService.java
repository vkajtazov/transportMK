package com.project.transportMK.service;

import java.io.IOException;

import org.json.JSONException;

import com.project.transportMK.model.City;

public interface LocationService {

	City getCityLocation(String cityName) throws IOException, JSONException;

}
