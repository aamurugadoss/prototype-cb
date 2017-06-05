package com.weather.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weather.task.data.LocationDTO;
import com.weather.task.data.WeatherDataDTO;
import com.weather.task.service.WeatherDataService;

/**
 * @author Murugadoss
 * Controller class responsible for handling user request
 */
@Controller
public class WeatherDataController {
	/**
	 * Injecting weatherDataService
	 */
	@Autowired
	private WeatherDataService weatherDataService;

	/**
	 * Prepare home page with city populated.
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/home")
	public String preparePage(Model model) {
		List<LocationDTO> locationList = weatherDataService.findLocationList();
		model.addAttribute("locations", locationList);
		model.addAttribute("weatherData", new WeatherDataDTO());
		return "index";
	}
 
	/**
	 * This API is responsible for calling service method, get the weather data and send to view.
	 * @param location
	 * @param model
	 * @return
	 */
	@RequestMapping("/weatherdetails")
	public String findWeather(@RequestParam("location") String location, Model model) {
		if (!location.equals("NONE")) {
			WeatherDataDTO weatherDataDTO = new WeatherDataDTO();
			weatherDataDTO = weatherDataService.findWeatherDataByCity(location);
			List<LocationDTO> locationList = weatherDataService.findLocationList();
			model.addAttribute("weatherData", weatherDataDTO);
			model.addAttribute("locations", locationList);
			model.addAttribute("lastselected", location);
		} else {
			preparePage(model);
		}
		return "index";
	}
}
