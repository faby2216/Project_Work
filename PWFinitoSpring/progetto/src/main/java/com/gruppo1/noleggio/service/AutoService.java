package com.gruppo1.noleggio.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gruppo1.noleggio.entities.Auto;
import com.gruppo1.noleggio.repos.AutoRepo;

@Service
public class AutoService {
    @Autowired
    private AutoRepo autoR;

    public List<Auto> getAllAuto(){
        return autoR.findAll();
    }
    
    public void addAuto(Auto auto){
        autoR.save(auto);
    }

    public void updateAuto(Integer id, Auto autoModificata){
        Optional<Auto> autoE = autoR.findById(id);
        if(autoE.isPresent()){
            Auto autoEsistente = autoE.get();
            autoEsistente.setNome(autoModificata.getNome());
            autoEsistente.setMarca(autoModificata.getMarca());
            autoEsistente.setDescrizione(autoModificata.getDescrizione());
            autoEsistente.setPrezzo(autoModificata.getPrezzo());
            autoEsistente.setCarburante(autoModificata.getCarburante());
            autoEsistente.setNoleggiata(autoModificata.getNoleggiata());
            autoEsistente.setVia(autoModificata.getVia());
            autoEsistente.setUtente(autoModificata.getUtente());
            autoEsistente.setImg(autoModificata.getImg());
            autoR.save(autoEsistente);
        }
    }
    public void delateAuto(int id){
        autoR.deleteById(id);
    }
}
