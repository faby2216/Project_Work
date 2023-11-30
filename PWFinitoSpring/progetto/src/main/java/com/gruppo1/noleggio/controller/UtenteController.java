package com.gruppo1.noleggio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gruppo1.noleggio.entities.Archivio_Utenti;
import com.gruppo1.noleggio.service.UtentiService;

@RestController
@RequestMapping("/admin/utenti")
public class UtenteController {
        @Autowired
        private UtentiService utenteS;
        @CrossOrigin
        @GetMapping("/listaUtenti")
        public List<Archivio_Utenti> listaUtenti(){
            return utenteS.getAllUtenti();
        }
}
