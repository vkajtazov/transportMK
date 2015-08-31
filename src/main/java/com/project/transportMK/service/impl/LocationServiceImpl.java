package com.project.transportMK.service.impl;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import com.project.transportMK.model.City;
import com.project.transportMK.service.LocationService;

@Repository
public class LocationServiceImpl implements LocationService {

	private String baseUrl = "http://maps.google.com/maps/api/geocode/json?"
			+ "sensor=false&address=";

	@Override
	public City getCityLocation(String cityName) throws IOException,
			JSONException {
		JSONObject obj = getDestinationLocation(cityName);
		return fillCityObject(obj);
	}

	private JSONObject getDestinationLocation(String destination)
			throws IOException, JSONException {
		// build a URL
		String urlRequest = baseUrl + URLEncoder.encode(destination, "UTF-8");
		URL url = new URL(urlRequest);

		// read from the URL
		Scanner scan = new Scanner(url.openStream());
		String str = new String();
		while (scan.hasNext())
			str += scan.nextLine();
		scan.close();

		// build a JSON object
		JSONObject obj = new JSONObject(str);
		if (!obj.getString("status").equals("OK"))
			return null;

		return obj;
	}

	private City fillCityObject(JSONObject obj) throws JSONException {
		City city = new City();
		try{
		JSONObject res = obj.getJSONArray("results").getJSONObject(0);
		JSONObject loc = res.getJSONObject("geometry")
				.getJSONObject("location");

		city.setCityLatitude(loc.getDouble("lat"));
		city.setCityLongitude(loc.getDouble("lng"));
		}
		catch(NullPointerException ex){
			return null;
		}
		return city;
	}

}
