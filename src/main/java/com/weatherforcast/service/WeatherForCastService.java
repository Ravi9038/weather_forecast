package com.weatherforcast.service;
import com.weatherforcast.helperBean.BaseResponse;

public interface WeatherForCastService {

	public BaseResponse<String> getForecastSummaryByLocationName(String locationName);

	public BaseResponse<String> getHourlyForecastSummaryByLocationName(String locationName);

}
