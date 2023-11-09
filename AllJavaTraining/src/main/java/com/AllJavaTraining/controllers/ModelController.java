package com.AllJavaTraining.controllers;

import com.AllJavaTraining.domain.model.Model;
import com.AllJavaTraining.dtos.ModelDTO;
import com.AllJavaTraining.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/models")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @PostMapping
    public ResponseEntity<Model> createModel(@RequestBody ModelDTO model) throws Exception {
        Model newModel = modelService.createModel(model);
        return new ResponseEntity<>(newModel, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Model>>getAllModels(){
        List<Model> models = this.modelService.getAllModels();
        return new ResponseEntity<>(models, HttpStatus.OK);
    }

}
