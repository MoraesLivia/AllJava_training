package com.AllJavaTraining.dtos;
import com.AllJavaTraining.domain.model.Model;

import java.util.Date;

public record VehicleDTO(Integer id, String chassi, Model model, Integer fabricationDate, Integer modelDate, Date registerDate) {
}
