package com.shipment.shipmentservice.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipment.shipmentservice.beans.Location;
import com.shipment.shipmentservice.beans.ShipmentInfo;
import com.shipment.shipmentservice.repository.ShipmentRepository;

@RestController
public class ShipmentController {
	
	@Autowired
	ShipmentRepository shipRepo;
	
	static{
		Location loc = new Location("Orlando","FL",LocalDateTime.now());
		Location loc1 = new Location("Atlanta","GA",LocalDateTime.now());
		
		List<Location> locations = new ArrayList<>();
		locations.add(loc);
		locations.add(loc1);
		
		ShipmentInfo shipmentInfo = new ShipmentInfo(1234456L, locations);
		
	
	}
	
	
	
	/*Create an API, 
	 * the list of locations that it went through
	 * Current Location
	 * 
	 */
	@GetMapping("/v1/api/location/{trackingId}")
	public List<Location> getCurrentLocation(@PathVariable Long trackingId){
		
		Optional<ShipmentInfo> shipInfo = shipRepo.findById(trackingId);
		
		List<Location> locs = shipInfo.get().getArrivalLocations();
		

		return locs;
	}
	
	@PostMapping("/v1/api/location")
	public ResponseEntity<?> createShipmentInfo(@RequestBody ShipmentInfo shipInfo){
		shipRepo.save(shipInfo);
		
		return ResponseEntity.ok().body(shipRepo.findById(shipInfo.getTrackingId()).get());
	}

}
