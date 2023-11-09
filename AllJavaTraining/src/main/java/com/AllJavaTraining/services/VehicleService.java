package com.AllJavaTraining.services;

import com.AllJavaTraining.domain.model.Model;
import com.AllJavaTraining.domain.vehicle.Vehicle;
import com.AllJavaTraining.dtos.VehicleDTO;
import com.AllJavaTraining.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private ModelService modelService;

    @Autowired
    private VehicleRepository repository;

    public Vehicle createVehicle(VehicleDTO data) throws Exception{
        Model model = this.modelService.findModelById(data.model().getId());

        Vehicle newVehicle = new Vehicle(data);
        this.saveVehicle(newVehicle);
        return newVehicle;
    }

    public List<Vehicle> getAllVehicles(){
        return this.repository.findAll();
    }


    public void saveVehicle(Vehicle vehicle){
        this.repository.save(vehicle);
    }
}
