package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {
    @JsonProperty("name")
    private String name;
    @JsonProperty("main")
    private WeatherMainData main;
    @JsonProperty("temperature")
    private double temperature;
    @JsonProperty("humidity")
    private double humidity;
    @JsonProperty("pressure")
    private double pressure;
    @JsonProperty("windSpeed")
    private double windSpeed;
    @JsonProperty("visibility")
    private double visibility;
    @JsonProperty("weatherDescription")
    private String weatherDescription;
    @JsonProperty("sunriseTime")
    private long sunriseTime;
    @JsonProperty("sunsetTime")
    private long sunsetTime;
    @JsonProperty("precipitation")
    private double precipitation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WeatherMainData getMain() {
		return main;
	}
	public void setMain(WeatherMainData main) {
		this.main = main;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public double getVisibility() {
		return visibility;
	}
	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public long getSunriseTime() {
		return sunriseTime;
	}
	public void setSunriseTime(long sunriseTime) {
		this.sunriseTime = sunriseTime;
	}
	public long getSunsetTime() {
		return sunsetTime;
	}
	public void setSunsetTime(long sunsetTime) {
		this.sunsetTime = sunsetTime;
	}
	public double getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}
	public WeatherData(String name, WeatherMainData main, double temperature, double humidity, double pressure,
			double windSpeed, double visibility, String weatherDescription, long sunriseTime, long sunsetTime,
			double precipitation) {
		super();
		this.name = name;
		this.main = main;
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.windSpeed = windSpeed;
		this.visibility = visibility;
		this.weatherDescription = weatherDescription;
		this.sunriseTime = sunriseTime;
		this.sunsetTime = sunsetTime;
		this.precipitation = precipitation;
	}
	public WeatherData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WeatherData [name=" + name + ", main=" + main + ", temperature=" + temperature + ", humidity="
				+ humidity + ", pressure=" + pressure + ", windSpeed=" + windSpeed + ", visibility=" + visibility
				+ ", weatherDescription=" + weatherDescription + ", sunriseTime=" + sunriseTime + ", sunsetTime="
				+ sunsetTime + ", precipitation=" + precipitation + "]";
	}
    

    
}

