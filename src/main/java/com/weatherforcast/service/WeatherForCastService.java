package com.weatherforcast.service;
import com.weatherforcast.bean.JsonRootBean;
import com.weatherforcast.helperBean.BaseResponse;

public interface WeatherForCastService {

	public BaseResponse<String> getForecastSummaryByLocationName(String locationName);

	public BaseResponse<JsonRootBean> getHourlyForecastSummaryByLocationName(String locationName);

}
