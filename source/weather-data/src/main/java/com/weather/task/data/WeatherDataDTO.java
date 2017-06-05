package com.weather.task.data;

/**
 * @author Murugadoss
 *
 */
public class WeatherDataDTO {
	public WeatherDataDTO() {
	}

	public WeatherDataDTO(String location, String position, String condition, String pressure, String humidity,
			String temp, String date, String time) {
		super();
		this.location = location;
		this.position = position;
		this.condition = condition;
		this.pressure = pressure;
		this.humidity = humidity;
		this.temp = temp;
		this.date = date;
		this.time = time;
	}

	/**
	 * location - String
	 */
	private String location;
	/**
	 * position - String
	 */
	private String position;
	/**
	 * condition - String
	 */
	private String condition;
	/**
	 * pressure - String
	 */
	private String pressure;
	/**
	 * humidity - String
	 */
	private String humidity;
	/**
	 * temp - String
	 */
	private String temp;
	/**
	 * date - String
	 */
	private String date;
	/**
	 * time - String
	 */
	private String time;

	/**
	 * @return date - String
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return time - String
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return temp - String
	 */
	public String getTemp() {
		return temp;
	}

	/**
	 * @param temp
	 */
	public void setTemp(String temp) {
		this.temp = temp;
	}

	/**
	 * @return location - String
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return position - String
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return condition - String
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * @return pressure - String
	 */
	public String getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 */
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return humidity - String
	 */
	public String getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 */
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
}
