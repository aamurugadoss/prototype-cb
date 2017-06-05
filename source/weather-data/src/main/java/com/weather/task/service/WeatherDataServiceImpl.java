package com.weather.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.task.data.LocationDTO;
import com.weather.task.data.WeatherDataDTO;
import com.weather.task.repository.WeatherDataDAO;

/**
 * WeatherDataServiceImpl service is responsible to delegate the call to data
 * transfer object
 * 
 * @author Murugadoss
 *
 */
@Service("weatherDataService")
public class WeatherDataServiceImpl implements WeatherDataService {

	/**
	 * WeatherDataDAO
	 */
	@Autowired
	private WeatherDataDAO weatherDataDAO;

	/**
	 * @param weatherDataDAO
	 */
	WeatherDataServiceImpl(WeatherDataDAO weatherDataDAO) {
		this.weatherDataDAO = weatherDataDAO;
	}

	/*
	 * Responsible to find the Weather Data based on city
	 * 
	 * @see
	 * com.weather.task.service.WeatherDataService#findWeatherDataByCity(java.
	 * lang.String)
	 */
	@Override
	public WeatherDataDTO findWeatherDataByCity(String city) {
		return weatherDataDAO.findWeatherDataByCity(city);
	}

	/*
	 * Responsible to find list of cities available in repository.
	 * 
	 * @see com.weather.task.service.WeatherDataService#findLocationList()
	 */
	@Override
	public List<LocationDTO> findLocationList() {
		return weatherDataDAO.findLocationList();
	}
}
