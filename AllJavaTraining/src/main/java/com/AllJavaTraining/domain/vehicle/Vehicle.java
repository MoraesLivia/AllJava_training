package com.AllJavaTraining.domain.vehicle;

import com.AllJavaTraining.domain.model.Model;
import com.AllJavaTraining.dtos.VehicleDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "vehicles")
@Table(name = "vehicles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String chassi;
    @OneToOne
    @JoinColumn(name = "model_id")
    private Model model;
    private Integer fabricationDate;
    private Integer modelDate;
    private Date registerDate;

    public Vehicle(VehicleDTO data){
        this.chassi = data.chassi();
        this.model = data.model();
        this.fabricationDate = data.fabricationDate();
        this.modelDate = data.modelDate();
        this.registerDate = data.registerDate();

    }
}
