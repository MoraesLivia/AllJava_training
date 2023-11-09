package com.AllJavaTraining.controllers;

import com.AllJavaTraining.domain.vehicle.Vehicle;
import com.AllJavaTraining.dtos.VehicleDTO;
import com.AllJavaTraining.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@RequestBody VehicleDTO vehicle) throws Exception {
        Vehicle newVehicle = vehicleService.createVehicle(vehicle);
        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Vehicle>>getAllVehicles(){
        List<Vehicle> vehicles = this.vehicleService.getAllVehicles();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }
}
