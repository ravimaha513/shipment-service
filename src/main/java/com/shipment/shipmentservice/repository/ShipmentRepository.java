package com.shipment.shipmentservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shipment.shipmentservice.beans.ShipmentInfo;

@Repository
public interface ShipmentRepository extends MongoRepository<ShipmentInfo, Long>{

}
