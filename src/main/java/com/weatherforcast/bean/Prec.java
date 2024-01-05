package com.weatherforcast.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prec {

	private int sum;
    @JsonProperty("sumAsRain")
    private int sumasrain;
    private int probability;
    private int classs;

	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSumasrain() {
		return sumasrain;
	}
	public void setSumasrain(int sumasrain) {
		this.sumasrain = sumasrain;
	}
	public int getProbability() {
		return probability;
	}
	public void setProbability(int probability) {
		this.probability = probability;
	}
	public int getClasss() {
		return classs;
	}
	public void setClasss(int classs) {
		this.classs = classs;
	}
    
    
}
