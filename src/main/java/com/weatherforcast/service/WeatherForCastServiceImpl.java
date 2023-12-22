package com.weatherforcast.service;


import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.weatherforcast.helperBean.BaseResponse;

@Service
public class WeatherForCastServiceImpl implements WeatherForCastService {
	private static final Logger LOG = LogManager.getFormatterLogger();
	
	@Value("${X-RapidAPI-Key}")
	private String XRapidApiKey;
	
	@Value("${X-RapidAPI-Host}")
	private String XRapidApiHost;
	
	@Value("${forcast-rapid-api}")
	private String XRapidApiURL;
	
	
	@Override
	public BaseResponse<String> getForecastSummaryByLocationName(String locationName) {
		
		ResponseEntity<String> responseEntity = null;
		BaseResponse<String> baseResponse = new BaseResponse<>();
		List<String> lstData = new ArrayList<>();
		try {
			
			String url = XRapidApiURL+locationName+"/summary/";
	        RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			MultiValueMap<String, String> xWwwFormData = new LinkedMultiValueMap<>();
			headers.add("X-RapidAPI-Key", XRapidApiKey);
			headers.add("X-RapidAPI-Host", XRapidApiHost);
			xWwwFormData.add("locationName", locationName);
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(xWwwFormData, headers);
			responseEntity = restTemplate.exchange(url,HttpMethod.GET, request,String.class);
			LOG.info(responseEntity);
			lstData.add(responseEntity.toString());
			baseResponse.setData(lstData);
			baseResponse.getResponse().setRespCode("0000");
			baseResponse.getResponse().setType("SUCCESS");
			baseResponse.getResponse().setRespHdr("WEATHER FORCAST DATA");
		} catch (Exception e) {
			baseResponse.getErrors().setCode("1111");
			baseResponse.getErrors().setInternalMessage(e.getMessage());
			baseResponse.getErrors().setUserMessage("Failed to get the Data");
			LOG.error("Failed to featch the data "+e);
		}
		return baseResponse;
	}


	@Override
	public BaseResponse<String> getHourlyForecastSummaryByLocationName(String locationName) {
		ResponseEntity<String> responseEntity = null;
		BaseResponse<String> baseResponse = new BaseResponse<>();
		List<String> lstData = new ArrayList<>();
		try {
			
			String url = XRapidApiURL+locationName+"/hourly/";
	        RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			MultiValueMap<String, String> xWwwFormData = new LinkedMultiValueMap<>();
			headers.add("X-RapidAPI-Key", XRapidApiKey);
			headers.add("X-RapidAPI-Host", XRapidApiHost);
			xWwwFormData.add("locationName", locationName);
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(xWwwFormData, headers);
			responseEntity = restTemplate.exchange(url,HttpMethod.GET, request,String.class);
			LOG.info(responseEntity);
			lstData.add(responseEntity.toString());
			baseResponse.setData(lstData);
			baseResponse.getResponse().setRespCode("0000");
			baseResponse.getResponse().setType("SUCCESS");
			baseResponse.getResponse().setRespHdr("WEATHER FORCAST DATA");
		} catch (Exception e) {
			baseResponse.getErrors().setCode("1111");
			baseResponse.getErrors().setInternalMessage(e.getMessage());
			baseResponse.getErrors().setUserMessage("Failed to get the Data");
			LOG.error("Failed to featch the data "+e);
		}
		return baseResponse;
	}

	
}
