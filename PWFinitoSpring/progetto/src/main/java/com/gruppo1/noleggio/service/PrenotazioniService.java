package com.gruppo1.noleggio.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruppo1.noleggio.entities.Prenotazioni;
import com.gruppo1.noleggio.repos.PrenotazioniRepo;

@Service
public class PrenotazioniService {
    @Autowired
    private PrenotazioniRepo prenotazioniR;

    public Prenotazioni getPrenotazioneById(int prenotazioneId){
        return prenotazioniR.findById(prenotazioneId).orElse(null);
    }

    public Prenotazioni creaPrenotazione(Prenotazioni prenotazione){
        return prenotazioniR.save(prenotazione);
    }

    public List<Prenotazioni> getPrenotazioniByUserId(int userId) {
        List<Prenotazioni> prenotazioni = prenotazioniR.findAll();
        List<Prenotazioni> prenotazioniUtente = prenotazioni.stream()
                .filter(prenotazione -> prenotazione.getIdUtente() == userId)
                .collect(Collectors.toList());

        return prenotazioniUtente;
    }
    public List<Prenotazioni> getAllPrenotazioni(){
        return prenotazioniR.findAll();
    }
}
