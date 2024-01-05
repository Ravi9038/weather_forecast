package com.weatherforcast.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {

	private String unit;
	private String direction;
	private int avg;
	private int min;
	private int max;
	private String text;
	@JsonProperty("significationWind")
	private boolean significationwind;
	private Gusts gusts;
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isSignificationwind() {
		return significationwind;
	}
	public void setSignificationwind(boolean significationwind) {
		this.significationwind = significationwind;
	}
	public Gusts getGusts() {
		return gusts;
	}
	public void setGusts(Gusts gusts) {
		this.gusts = gusts;
	}
	
	
}
