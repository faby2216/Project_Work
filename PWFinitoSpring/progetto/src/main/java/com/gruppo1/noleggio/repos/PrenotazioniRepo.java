package com.gruppo1.noleggio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gruppo1.noleggio.entities.Prenotazioni;

public interface PrenotazioniRepo extends JpaRepository<Prenotazioni, Integer>{
    
}
