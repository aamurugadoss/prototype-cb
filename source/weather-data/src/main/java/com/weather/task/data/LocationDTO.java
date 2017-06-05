package com.weather.task.data;

/**
 * @author Murugadoss. This class is responsible for holding city code and name
 */
public class LocationDTO {

	/**
	 * locationCode - String
	 */
	private String locationCode;
	/**
	 * locationName - String
	 */
	private String locationName;

	/**
	 * @param locationCode
	 * @param locationName
	 */
	public LocationDTO(String locationCode, String locationName) {
		super();
		this.locationCode = locationCode;
		this.locationName = locationName;
	}

	/**
	 * @return String
	 */
	public String getLocationCode() {
		return locationCode;
	}

	/**
	 * @param locationCode
	 */
	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * @return String
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	/**
	 * @param code
	 * @return boolean
	 */
	public boolean isSelected(String code) {
		if (code != null) {

			return code.equals(locationCode);
		}
		return false;
	}
}
