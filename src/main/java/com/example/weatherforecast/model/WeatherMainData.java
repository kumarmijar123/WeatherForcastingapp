package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherMainData {

	@JsonProperty("tempMin")
	private double tempMin;
	@JsonProperty("tempMax")
	private double tempMax;
	@JsonProperty("feelsLike")
	private double feelsLike;
	@JsonProperty("pressure")
	private double pressure;
	@JsonProperty("humidity")
	private double humidity;
	public double getTempMin() {
		return tempMin;
	}
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	public double getTempMax() {
		return tempMax;
	}
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	public double getFeelsLike() {
		return feelsLike;
	}
	public void setFeelsLike(double feelsLike) {
		this.feelsLike = feelsLike;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public WeatherMainData(double tempMin, double tempMax, double feelsLike, double pressure, double humidity) {
		super();
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.feelsLike = feelsLike;
		this.pressure = pressure;
		this.humidity = humidity;
	}
	public WeatherMainData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WeatherMainData [tempMin=" + tempMin + ", tempMax=" + tempMax + ", feelsLike=" + feelsLike
				+ ", pressure=" + pressure + ", humidity=" + humidity + "]";
	}	
	
	
	
	
	
	
}