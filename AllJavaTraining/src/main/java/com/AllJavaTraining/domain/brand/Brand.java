package com.AllJavaTraining.domain.brand;

import com.AllJavaTraining.dtos.BrandDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "brands")
@Table(name = "brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand_description;

    public Brand (BrandDTO data){
        this.brand_description = data.brand_description();
    }
}
