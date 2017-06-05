package com.weather.task.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.weather.task.data.LocationDTO;
import com.weather.task.data.WeatherDataDTO;
import com.weather.task.service.WeatherDataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherDataControllerTest {
	private static final String city = "SYD";
	MockMvc mockMvc;
	@Autowired
	private WebApplicationContext webApplicationContext;
	@MockBean
	WeatherDataService weatherDataServiceMock;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testFindWeatherDataByCity() throws Exception {
		when(weatherDataServiceMock.findWeatherDataByCity("SYD")).thenReturn(new WeatherDataDTO("Sydney",
				"-33.86, 151.21, 31", "Rain", "1010.3 hPa", "97%", "+12.5°C","2017-06-04","08:55PM"));
		mockMvc.perform(get("/weatherdetails").param("location", city)).andExpect(status().isOk());
	}
	@Test
	public void testPreparePage() throws Exception {
		List<LocationDTO> list = new ArrayList<>();
		LocationDTO location1 = new LocationDTO("SYD", "Sydney");
		list.add(location1);
		when(weatherDataServiceMock.findLocationList()).thenReturn(list);
		mockMvc.perform(get("/home")).andExpect(status().isOk());
	}
}
