package com.shipment.shipmentservice.beans;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;


public class Location {
	
	
	String cityName;
	String stateName;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	LocalDateTime arrivalTime;
	
	
	
	public Location() {
		super();

	}
	public Location(String cityName, String stateName, LocalDateTime arrivalTime) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
		this.arrivalTime = arrivalTime;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	

}
