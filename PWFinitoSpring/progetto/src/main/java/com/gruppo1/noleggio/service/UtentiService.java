package com.gruppo1.noleggio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruppo1.noleggio.entities.Archivio_Utenti;
import com.gruppo1.noleggio.repos.UtentiRepo;

@Service
public class UtentiService {
        @Autowired
        private UtentiRepo utentiR;

        public List<Archivio_Utenti> getAllUtenti(){
            return utentiR.findAll();
        }

        public Archivio_Utenti getUtenteById(int id){
            return utentiR.findById(id).orElse(null);
        }
        public void addUtente(Archivio_Utenti utente){
            utentiR.save(utente);
        }
        
}
