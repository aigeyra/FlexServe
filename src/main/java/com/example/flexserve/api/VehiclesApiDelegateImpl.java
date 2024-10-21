package com.example.flexserve.api;

import com.example.flexserve.model.VehiclesGet200ResponseInner;
import com.example.flexserve.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VehiclesApiDelegateImpl implements VehiclesApiDelegate {

    private final VehicleService vehicleService;

    public VehiclesApiDelegateImpl(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Override
    public ResponseEntity<List<VehiclesGet200ResponseInner>> vehiclesGet() throws Exception {
        List<VehiclesGet200ResponseInner> vehicles = vehicleService.getAllVehicles();
        return ResponseEntity.ok(vehicles);
    }

    @Override
    public ResponseEntity<Void> vehiclesIdDelete(UUID id) throws Exception {
        boolean deleted = vehicleService.deleteVehicleById(id.toString());
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @Override
    public ResponseEntity<Void> vehiclesPost(VehiclesGet200ResponseInner vehiclesGet200ResponseInner) throws Exception {
        vehicleService.addVehicle(vehiclesGet200ResponseInner);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}