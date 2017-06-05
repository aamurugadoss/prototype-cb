package com.weather.task.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.weather.task.data.LocationDTO;
import com.weather.task.data.WeatherDataDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherDataDAOTest {

	@Autowired
	private WeatherDataDAO weatherDataDAO;

	@Test
	public void testFindWeatherDataByCity() {
		WeatherDataDTO searchResults = weatherDataDAO.findWeatherDataByCity("MUM");
		assertNotNull(searchResults);
	}
	@Test
	public void testFindLocationList() {
		List<LocationDTO> searchResults = weatherDataDAO.findLocationList();
		assertEquals(10, searchResults.size());
	}
}
