package com.AllJavaTraining.services;

import com.AllJavaTraining.domain.brand.Brand;
import com.AllJavaTraining.domain.model.Model;
import com.AllJavaTraining.dtos.ModelDTO;
import com.AllJavaTraining.repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelRepository repository;

    @Autowired
    private BrandService brandService;

    public Model findModelById(Integer id) throws Exception {
        return this.repository.findModelById(id).orElseThrow(() -> new Exception("Modelo não encontrado"));
    }

    public Model createModel(ModelDTO data) throws Exception {
        Brand brand = this.brandService.findBrandById(data.brand().getId());

        Model newModel = new Model(data);
        this.saveModel(newModel);
        return newModel;
    }


    public List<Model> getAllModels(){
        return this.repository.findAll();
    }


    public void saveModel(Model model){
        this.repository.save(model);
    }
}
