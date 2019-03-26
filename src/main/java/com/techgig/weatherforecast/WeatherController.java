package com.techgig.weatherforecast;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/api")
public class WeatherController {
	

	@Autowired
	private WeatherService service;

	@GetMapping(value = "/welcome", produces = { MediaType.APPLICATION_JSON })
	public String welcome() {
		System.out.println("from Service:"+service.getMessage());
		return "Welcome to WeatherForecast Services";
	}
	
	@GetMapping(value="/weather",produces = { MediaType.APPLICATION_JSON })
	public GenericResponse<List<WeatherResponse>> getWeatherForAllLocation() {
		
		GenericResponse<List<WeatherResponse>> response  = new GenericResponse<>();
		List<WeatherResponse> weatherResponseList = new ArrayList<>();
		
		//if all ok
		response.setMessage("");
		response.setResponse(weatherResponseList);
		response.setResponseCode("200");
		//if not ok
		return response;
	}
	@GetMapping(value ="/weather/{start}/{end}", produces = { MediaType.APPLICATION_JSON })
	public GenericResponse<WeatherResponse> getWeatherForParticularTime() {
		
		return null;
	}
}
