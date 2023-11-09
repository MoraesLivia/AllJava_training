package com.AllJavaTraining.domain.model;

import com.AllJavaTraining.domain.brand.Brand;
import com.AllJavaTraining.dtos.ModelDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "model")
@Table(name = "model")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model_description;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    public Model (ModelDTO data){
        this.model_description= data.model_description();
        this.brand = data.brand();
    }
}
