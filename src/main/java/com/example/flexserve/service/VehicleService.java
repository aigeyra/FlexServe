package com.example.flexserve.service;

import com.example.flexserve.model.VehiclesGet200ResponseInner;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private List<VehiclesGet200ResponseInner> vehicles = new ArrayList<>();

    public List<VehiclesGet200ResponseInner> getAllVehicles() {
        return vehicles;
    }

    public void addVehicle(VehiclesGet200ResponseInner vehicle) {
        vehicles.add(vehicle);
    }

    public boolean deleteVehicleById(String id) {
        return vehicles.removeIf(vehicle -> vehicle.getId().equals(UUID.fromString(id)));
    }
}
