package com.AllJavaTraining.repositories;

import com.AllJavaTraining.domain.brand.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
