package com.AllJavaTraining.controllers;

import com.AllJavaTraining.domain.concessionaire.Concessionaire;
import com.AllJavaTraining.dtos.ConcessionaireDTO;
import com.AllJavaTraining.services.ConcessionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController() //é uma combinação de controller com requestbody
@RequestMapping("/concessionaires")
public class ConcessionaireController {

    @Autowired
    private ConcessionaireService concessionaireService;

    //endpoint para listar as concessionárias
    @PostMapping
    public ResponseEntity<Concessionaire> createConcessionaire(@RequestBody ConcessionaireDTO concessionaire){
        Concessionaire newConcessionaire = concessionaireService.createConcessionaire(concessionaire);
        return new ResponseEntity<>(newConcessionaire, HttpStatus.CREATED);

        //o requestbody é para saber que o data está vindo no corpo da requisição
    }

    //endpoint para listar as concessionárias para ver se está adicionando da forma correta
    @GetMapping
    public ResponseEntity<List<Concessionaire>>getAllConcessionaires(){
        List<Concessionaire> concessionaires = this.concessionaireService.getAllConcessionaires();
        return new ResponseEntity<>(concessionaires, HttpStatus.OK);
    }
}
