package com.AllJavaTraining.repositories;

import com.AllJavaTraining.domain.brand.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
    Optional<Brand> findBrandById(Integer id);
}
