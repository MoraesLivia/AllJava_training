package com.AllJavaTraining.domain.model;

import com.AllJavaTraining.domain.brand.Brand;
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
    private String description;
    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
