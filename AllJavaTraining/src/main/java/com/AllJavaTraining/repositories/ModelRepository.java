package com.AllJavaTraining.repositories;

import com.AllJavaTraining.domain.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
