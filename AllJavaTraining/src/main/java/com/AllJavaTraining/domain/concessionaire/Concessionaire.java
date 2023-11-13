package com.AllJavaTraining.domain.concessionaire;
import com.AllJavaTraining.domain.vehicle.Vehicle;
import com.AllJavaTraining.dtos.ConcessionaireDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="concessionaire")
@Table(name= "concessionaire")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Concessionaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "concessionaire", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Vehicle> vehicles;

    public Concessionaire(ConcessionaireDTO data){
        this.name = data.name();
    }
}
