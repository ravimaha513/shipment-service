package com.shipment.shipmentservice.beans;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ShipmentInfo {
	
	@Id
	Long trackingId;
	List<Location> arrivalLocations;
	public Long getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(Long trackingId) {
		this.trackingId = trackingId;
	}
	public List<Location> getArrivalLocations() {
		return arrivalLocations;
	}
	public void setArrivalLocations(List<Location> arrivalLocations) {
		this.arrivalLocations = arrivalLocations;
	}
	public ShipmentInfo(Long trackingId, List<Location> arrivalLocations) {
		super();
		this.trackingId = trackingId;
		this.arrivalLocations = arrivalLocations;
	}
	public ShipmentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
