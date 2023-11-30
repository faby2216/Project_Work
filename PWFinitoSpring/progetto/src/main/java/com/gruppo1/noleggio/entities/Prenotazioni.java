package com.gruppo1.noleggio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idAuto")
    private Auto auto;
    @ManyToOne
    @JoinColumn(name = "idUtente")
    private Archivio_Utenti utente;

    private String dataPrenotazione;
    private int prezzo=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Archivio_Utenti getUtente() {
        return utente;
    }
    public int getIdUtente() {
        if (utente != null) {
            return utente.getId();
        } else {
            return 0; 
        }
    }

    public void setUtente(Archivio_Utenti utente) {
        this.utente = utente;
    }

    public String getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(String dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

  
    

}
