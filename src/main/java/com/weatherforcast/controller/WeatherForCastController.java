package com.weatherforcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatherforcast.helperBean.BaseResponse;
import com.weatherforcast.service.WeatherForCastService;


@RestController
@RequestMapping("/api")
public class WeatherForCastController {

	@Autowired
	private WeatherForCastService weatherForCastService;

	
	@GetMapping("/get/forecast/summary/bylocationname")
	public BaseResponse<String> getForecastSummaryByLocationName(@RequestParam String locationName) {
		BaseResponse<String> responseEntity = weatherForCastService.getForecastSummaryByLocationName(locationName);
		return responseEntity;
	}
	
	@GetMapping("/get/hourly/forecast/bylocationname")
	public BaseResponse<String> getHourlyForecastSummaryByLocationName(@RequestParam String locationName) {
		BaseResponse<String> responseEntity = weatherForCastService.getHourlyForecastSummaryByLocationName(locationName);
		return responseEntity;
	}
}
