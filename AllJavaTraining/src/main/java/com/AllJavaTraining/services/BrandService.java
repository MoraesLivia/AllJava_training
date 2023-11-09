package com.AllJavaTraining.services;

import com.AllJavaTraining.domain.brand.Brand;
import com.AllJavaTraining.dtos.BrandDTO;
import com.AllJavaTraining.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepository repository;

    public Brand findBrandById(Integer id) throws Exception {
        return this.repository.findBrandById(id).orElseThrow(() -> new Exception("Marca não encontrada"));
    }

    public  Brand createBrand(BrandDTO data){
        Brand newBrand = new Brand(data);
        this.saveBrand(newBrand);
        return newBrand;
    }

    public List<Brand> getAllBrands(){
        return this.repository.findAll();
    }

    public void saveBrand(Brand brand){
        this.repository.save(brand);
    }
}
