	package com.example.weatherforecast.controller;
	
	import com.example.weatherforecast.model.WeatherData;
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.client.RestTemplate;
	
	@RestController
	public class WeatherController {
	
	    @Value("${weather.api.key}")	
	    private String apiKey;
	
	    @GetMapping("/weather")
	    public WeatherData getWeatherData(@RequestParam String city) {
	        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";
	        RestTemplate restTemplate = new RestTemplate();
	        String jsonResponse = restTemplate.getForObject(apiUrl, String.class, city, apiKey);
	        System.out.println("Raw JSON Response: " + jsonResponse);
	        return restTemplate.getForObject(apiUrl, WeatherData.class, city, apiKey);
	    }
	}
