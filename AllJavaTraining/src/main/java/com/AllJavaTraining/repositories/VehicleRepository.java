package com.AllJavaTraining.repositories;

import com.AllJavaTraining.domain.model.Model;
import com.AllJavaTraining.domain.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
