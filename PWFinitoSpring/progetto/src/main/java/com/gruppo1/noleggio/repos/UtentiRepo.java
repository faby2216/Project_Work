package com.gruppo1.noleggio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gruppo1.noleggio.entities.Archivio_Utenti;

public interface UtentiRepo extends JpaRepository<Archivio_Utenti, Integer>{
    
}
