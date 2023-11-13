package com.AllJavaTraining.domain.vehicle;

import com.AllJavaTraining.domain.concessionaire.Concessionaire;
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
    private Integer fabricationYear;
    private Integer modelYear;
    private Date registerDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "concessionaire_id", referencedColumnName = "id")
    private Concessionaire concessionaire;

    public Vehicle(VehicleDTO data){
        this.chassi = data.chassi();
        this.model = data.model();
        this.fabricationYear = data.fabricationYear();
        this.modelYear = data.modelYear();
        this.registerDate = data.registerDate();
        this.concessionaire = data.concessionaire();
    }
}
