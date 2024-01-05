package com.weatherforcast.bean;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Forecast {

	private List<Items> items;
    @JsonProperty("forecastDate")
    private Date forecastdate;
    @JsonProperty("nextUpdate")
    private Date nextupdate;
    private String source;
    private String point;
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public Date getForecastdate() {
		return forecastdate;
	}
	public void setForecastdate(Date forecastdate) {
		this.forecastdate = forecastdate;
	}
	public Date getNextupdate() {
		return nextupdate;
	}
	public void setNextupdate(Date nextupdate) {
		this.nextupdate = nextupdate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
    
    
}
