package com.AllJavaTraining.domain.vehicle;

import com.AllJavaTraining.domain.model.Model;
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
    private Integer fabrication_date;
    private Integer model_date;
    private Date register_date;
}
