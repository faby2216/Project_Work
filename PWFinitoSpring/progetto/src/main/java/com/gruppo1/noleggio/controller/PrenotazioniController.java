package com.gruppo1.noleggio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gruppo1.noleggio.entities.Prenotazioni;
import com.gruppo1.noleggio.service.PrenotazioniService;

@RestController
@RequestMapping("/admin/prenotazioni")
public class PrenotazioniController{
    @Autowired 
    private PrenotazioniService prenotazioniS;
    @CrossOrigin
    @PostMapping("/aggiungiPrenotazione")
    public Prenotazioni creaPrenotazioneC(@RequestBody Prenotazioni prenotazione){
        return prenotazioniS.creaPrenotazione(prenotazione);
    }
    @CrossOrigin
    @GetMapping("/prenotazione/{id}")
    public Prenotazioni getPrenotazioneByIdC(@PathVariable int id){
        return prenotazioniS.getPrenotazioneById(id);
    }
@CrossOrigin
    @GetMapping("/utente/{id}")
    public List<Prenotazioni> getPrenotazioniByUtenteId(@PathVariable int id){
        return prenotazioniS.getPrenotazioniByUserId(id);
    }
@CrossOrigin
    @GetMapping("/tutte")
    public List<Prenotazioni> getAllPrenotazioni() {
        return prenotazioniS.getAllPrenotazioni();
    }

}
