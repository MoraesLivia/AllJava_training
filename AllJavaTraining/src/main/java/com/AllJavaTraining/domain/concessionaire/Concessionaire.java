package com.AllJavaTraining.domain.concessionaire;
import com.AllJavaTraining.dtos.ConcessionaireDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

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

    public Concessionaire(ConcessionaireDTO data){
        this.name = data.name();
    }
}
