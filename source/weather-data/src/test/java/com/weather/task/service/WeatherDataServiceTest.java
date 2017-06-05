package com.weather.task.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.weather.task.data.LocationDTO;
import com.weather.task.data.WeatherDataDTO;
import com.weather.task.repository.WeatherDataDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherDataServiceTest {

	private WeatherDataDAO weatherDataDAOMock;

	private WeatherDataService weatherDataService;

	@Before
	public void setUp() {
		weatherDataDAOMock = Mockito.mock(WeatherDataDAO.class);
		weatherDataService = new WeatherDataServiceImpl(weatherDataDAOMock);
	}

	@Test
	public void testFindWeatherDataByCity() throws Exception {
		WeatherDataDTO dto = new WeatherDataDTO("Sydney", "-33.86, 151.21, 31", "Rain", "1010.3 hPa", "97%", "+12.5°C",
				"2017-06-04", "08:55PM");
		when(weatherDataDAOMock.findWeatherDataByCity("SYD")).thenReturn(dto);
		assertEquals("Sydney", weatherDataService.findWeatherDataByCity("SYD").getLocation());
	}

	@Test
	public void testFindLocationList() throws Exception {
		List<LocationDTO> list = new ArrayList<>();
		LocationDTO location1 = new LocationDTO("SYD", "Sydney");
		LocationDTO location2 = new LocationDTO("MEL", "Melbourne");
		list.add(location1);
		list.add(location2);
		when(weatherDataDAOMock.findLocationList()).thenReturn(list);
		assertEquals(2, weatherDataService.findLocationList().size());
	}
}
