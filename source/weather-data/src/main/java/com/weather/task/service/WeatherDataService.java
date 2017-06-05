package com.weather.task.service;

import java.util.List;

import com.weather.task.data.LocationDTO;
import com.weather.task.data.WeatherDataDTO;

/**
 * @author Murugadoss
 *
 */
public interface WeatherDataService {

	/**
	 * @param city
	 * @return
	 */
	public WeatherDataDTO findWeatherDataByCity(String city);

	/**
	 * @return
	 */
	public List<LocationDTO> findLocationList();

}
