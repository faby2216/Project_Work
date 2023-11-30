package com.gruppo1.noleggio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gruppo1.noleggio.entities.Auto;
import com.gruppo1.noleggio.service.AutoService;

@RestController
@RequestMapping("/admin/auto")
public class AutoController {
    @Autowired
    
    private AutoService autoS;
    @CrossOrigin
    @GetMapping("/listaAuto")
    public List<Auto> listaAuto(){
        return autoS.getAllAuto();
    }

    @CrossOrigin
    @PostMapping("/aggiungiAuto")
    public void aggiungiAuto(@RequestBody Auto auto){
        autoS.addAuto(auto);
    }
    
    @CrossOrigin
    @PutMapping(value = "/modificaVeicolo/{id}",consumes = "application/json")
    public void updateAuto(@PathVariable Integer id,@RequestBody Auto autoModificata){
        autoS.updateAuto(id,autoModificata);
    }
    
    @CrossOrigin
    @DeleteMapping("/eliminaAuto/{id}")
    public void deleteAuto(@PathVariable Integer id) {
        autoS.delateAuto(id);
    }


    
}
