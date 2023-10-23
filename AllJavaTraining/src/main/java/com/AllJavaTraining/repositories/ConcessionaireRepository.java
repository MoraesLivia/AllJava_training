package com.AllJavaTraining.repositories;

import com.AllJavaTraining.domain.concessionaire.Concessionaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConcessionaireRepository extends JpaRepository<Concessionaire, Integer> {
    Optional<Concessionaire> findConcessionaireById(Integer id); //Avaliar se vai ter utilidade
}
