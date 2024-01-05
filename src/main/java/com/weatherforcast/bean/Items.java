package com.weatherforcast.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items {

    private Date date;
    private int period;
    @JsonProperty("freshSnow")
    private double freshsnow;
    private Weather weather;
    @JsonProperty("sunHours")
    private double sunhours;
    @JsonProperty("rainHours")
    private double rainhours;
    private Prec prec;
    private Temperature temperature;
    private double pressure;
    @JsonProperty("relativeHumidity")
    private int relativehumidity;
    private Clouds clouds;
    private Wind wind;
    private Windchill windchill;
    @JsonProperty("snowLine")
    private Snowline snowline;
    @JsonProperty("isNight")
    private boolean isnight;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getFreshsnow() {
		return freshsnow;
	}
	public void setFreshsnow(double freshsnow) {
		this.freshsnow = freshsnow;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public double getSunhours() {
		return sunhours;
	}
	public void setSunhours(double sunhours) {
		this.sunhours = sunhours;
	}
	public double getRainhours() {
		return rainhours;
	}
	public void setRainhours(double rainhours) {
		this.rainhours = rainhours;
	}
	public Prec getPrec() {
		return prec;
	}
	public void setPrec(Prec prec) {
		this.prec = prec;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public int getRelativehumidity() {
		return relativehumidity;
	}
	public void setRelativehumidity(int relativehumidity) {
		this.relativehumidity = relativehumidity;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Windchill getWindchill() {
		return windchill;
	}
	public void setWindchill(Windchill windchill) {
		this.windchill = windchill;
	}
	public Snowline getSnowline() {
		return snowline;
	}
	public void setSnowline(Snowline snowline) {
		this.snowline = snowline;
	}
	public boolean isIsnight() {
		return isnight;
	}
	public void setIsnight(boolean isnight) {
		this.isnight = isnight;
	}
    
    
}
