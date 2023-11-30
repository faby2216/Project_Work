package com.gruppo1.noleggio.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gruppo1.noleggio.entities.Auto;

public interface AutoRepo extends JpaRepository<Auto, Integer>{
    
}
