package com.weather.task.utility;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Murugadoss Utility class to work with time zone.
 */
public class Util {

	/**
	 * @param city
	 * @return - ZonedDateTime
	 */
	public static ZonedDateTime getZoneTime(String zoneType) {
		Instant timeStamp = Instant.now();
		ZonedDateTime zonedDateTime = null;
		if (null != zoneType) {

			zonedDateTime = timeStamp.atZone(ZoneId.of(zoneType));
		} else {

			zonedDateTime = ZonedDateTime.now();
		}
		return zonedDateTime;
	}

	/**
	 * @return
	 */
	public static Map<String, String> getZoneTypeMap() {
		Map<String, String> zoneTypeMap = new HashMap<>();
		zoneTypeMap.put(CityConstant.SYDNEY, "Australia/Sydney");
		zoneTypeMap.put(CityConstant.MELBOURNE, "Australia/Melbourne");
		zoneTypeMap.put(CityConstant.ADELAIDE, "Australia/Adelaide");
		zoneTypeMap.put(CityConstant.LONDON, "Europe/London");
		zoneTypeMap.put(CityConstant.MUMBAI, "Asia/Kolkata");
		zoneTypeMap.put(CityConstant.NEWDELHI, "Asia/Kolkata");
		zoneTypeMap.put(CityConstant.NEWYORK, "America/New_York");
		zoneTypeMap.put(CityConstant.PARIS, "Europe/Paris");
		zoneTypeMap.put(CityConstant.BEIJING, "Asia/Shanghai");
		zoneTypeMap.put(CityConstant.MOSCOW, "Europe/Moscow");
		return zoneTypeMap;
	}
}
