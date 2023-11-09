package com.AllJavaTraining.repositories;

import com.AllJavaTraining.domain.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ModelRepository extends JpaRepository<Model, Integer> {
    Optional<Model> findModelById(Integer id);
}
