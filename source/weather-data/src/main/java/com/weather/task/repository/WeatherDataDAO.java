package com.weather.task.repository;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.weather.task.data.LocationDTO;
import com.weather.task.data.WeatherDataDTO;
import com.weather.task.utility.CityConstant;
import com.weather.task.utility.Util;

/**
 * @author Murugadoss WeatherDataDAO class is responsible to connect with
 *         repository and fetch data.
 */
@Repository("weatherDataDAO")
public class WeatherDataDAO {
	/**
	 * weatherDataMap - Holding weather data.
	 */
	private Map<String, WeatherDataDTO> weatherDataMap;

	/**
	 * locationList - Holding Location Data
	 */
	private List<LocationDTO> locationList;

	/**
	 * date format
	 */
	private static final String DATE_FORMAT = "yyyy-MM-dd";

	/**
	 * time format
	 */
	private static final String TIME_FORMAT = "hh:mm a";

	/**
	 * WeatherDataDAO
	 */
	WeatherDataDAO() {
		locationList = new ArrayList<>();
		weatherDataMap = new HashMap<>();
		weatherDataMap.put(CityConstant.SYDNEY,
				new WeatherDataDTO("Sydney", "-33.86, 151.21, 31", "Rain", "1010.3 hPa", "97%", "12.5°C", null, null));
		weatherDataMap.put(CityConstant.MELBOURNE, new WeatherDataDTO("Melbourne", "-37.83, 144.98, 7", "Snow",
				"998.4 hPa", "55%", "-12.3°C", null, null));
		weatherDataMap.put(CityConstant.ADELAIDE, new WeatherDataDTO("Adelaide", "-34.92, 138.62, 48", "Sunny",
				"1114.1 hPa", "12%", "39.4°C", null, null));
		weatherDataMap.put(CityConstant.LONDON,
				new WeatherDataDTO("London", "51.50, 0.12, 60", "Rain", "1001.5 hPa", "45%", "30.4°C", null, null));
		weatherDataMap.put(CityConstant.MUMBAI,
				new WeatherDataDTO("Mumbai", "19.07, 72.87, 45", "Sunny", "1100.7 hPa", "78%", "36.4°C", null, null));
		weatherDataMap.put(CityConstant.NEWDELHI,
				new WeatherDataDTO("New Delhi", "28.61, 77.2, 45", "Rain", "1050.3 hPa", "97%", "25.4°C", null, null));
		weatherDataMap.put(CityConstant.BEIJING,
				new WeatherDataDTO("Beijing", "39.90, 116.40, 50", "Rain", "1212.8 hPa", "56%", "28.4°C", null, null));
		weatherDataMap.put(CityConstant.NEWYORK,
				new WeatherDataDTO("New York", "40.71, -73.93, 50", "Snow", "920.5 hPa", "78%", "-12.5°C", null, null));
		weatherDataMap.put(CityConstant.PARIS,
				new WeatherDataDTO("Paris", "48.85, 2.35, 40", "Sunny", "1080.3 hPa", "45%", "25.4°C", null, null));
		weatherDataMap.put(CityConstant.MOSCOW,
				new WeatherDataDTO("Moscow", "55.75, 37.61, 20", "Snow", "890.9 hPa", "56%", "-11.4°C", null, null));
		locationList.add(new LocationDTO(CityConstant.SYDNEY, "Sydney"));
		locationList.add(new LocationDTO(CityConstant.MELBOURNE, "Melbourne"));
		locationList.add(new LocationDTO(CityConstant.ADELAIDE, "Adelaide"));
		locationList.add(new LocationDTO(CityConstant.LONDON, "London"));
		locationList.add(new LocationDTO(CityConstant.MUMBAI, "Mumbai"));
		locationList.add(new LocationDTO(CityConstant.NEWDELHI, "New Delhi"));
		locationList.add(new LocationDTO(CityConstant.NEWYORK, "New York"));
		locationList.add(new LocationDTO(CityConstant.PARIS, "Paris"));
		locationList.add(new LocationDTO(CityConstant.BEIJING, "Beijing"));
		locationList.add(new LocationDTO(CityConstant.MOSCOW, "Moscow"));
	}

	/**
	 * 
	 * @param city
	 * @return - Weather Data
	 */
	public WeatherDataDTO findWeatherDataByCity(String city) {
		WeatherDataDTO weatherDataDTO = weatherDataMap.get(city);
		ZonedDateTime zonedDateTime = Util.getZoneTime(Util.getZoneTypeMap().get(city));
		String date = zonedDateTime.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
		String time = zonedDateTime.format(DateTimeFormatter.ofPattern(TIME_FORMAT));
		weatherDataDTO.setDate(date);
		weatherDataDTO.setTime(time);
		return weatherDataDTO;
	}

	/**
	 * @return - locationList
	 */
	public List<LocationDTO> findLocationList() {
		return locationList;
	}
}
