package com.AllJavaTraining.dtos;
import com.AllJavaTraining.domain.concessionaire.Concessionaire;
import com.AllJavaTraining.domain.model.Model;

import java.util.Date;

public record VehicleDTO(Integer id, String chassi, Model model, Integer fabricationYear, Integer modelYear, Date registerDate, Concessionaire concessionaire) {
}
