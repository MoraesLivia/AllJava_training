package com.AllJavaTraining.services;

import com.AllJavaTraining.domain.concessionaire.Concessionaire;
import com.AllJavaTraining.dtos.ConcessionaireDTO;
import com.AllJavaTraining.repositories.ConcessionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcessionaireService {

    @Autowired
    private ConcessionaireRepository repository;

    //Dessa forma, quando eu for fazer o mapeamento, o veículo por exemplo não acessa direto o repositório de concessionária, e sim o service.

    public Concessionaire createConcessionaire(ConcessionaireDTO data){
        Concessionaire newConcessionaire = new Concessionaire(data);
        this.saveConcessionaire(newConcessionaire);
        return newConcessionaire;
    }

    public List<Concessionaire> getAllConcessionaires(){
        return this.repository.findAll();
    }

    public void saveConcessionaire(Concessionaire concessionaire){
        this.repository.save(concessionaire);
    }
}
