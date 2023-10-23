package com.AllJavaTraining.domain.brand;

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
    private String description;
}
