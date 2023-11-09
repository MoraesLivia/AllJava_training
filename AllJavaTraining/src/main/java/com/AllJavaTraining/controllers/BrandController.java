package com.AllJavaTraining.controllers;

import com.AllJavaTraining.dtos.BrandDTO;
import com.AllJavaTraining.services.BrandService;
import com.AllJavaTraining.domain.brand.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping
    public ResponseEntity<Brand> createBrand(@RequestBody BrandDTO brand){
        Brand newBrand = brandService.createBrand(brand);
        return new ResponseEntity<>(newBrand, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Brand>>getAllBrands(){
        List<Brand> brands = this.brandService.getAllBrands();
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }
}
