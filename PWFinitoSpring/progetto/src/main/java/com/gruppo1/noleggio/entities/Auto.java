package com.gruppo1.noleggio.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String nome;
    private String marca;
    private String descrizione;
    private double prezzo;
    private String noleggiata;
    private String carburante;
    private String via;
    private String img;
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Archivio_Utenti utente;


    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getDescrizione() {
        return descrizione;
    }


    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    public double getPrezzo() {
        return prezzo;
    }


    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


    public String getNoleggiata() {
        return noleggiata;
    }


    public void setNoleggiata(String noleggiata) {
        this.noleggiata = noleggiata;
    }


    public String getCarburante() {
        return carburante;
    }


    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }


    public String getVia() {
        return via;
    }


    public void setVia(String via) {
        this.via = via;
    }


    public String getImg() {
        return img;
    }


    public void setImg(String img) {
        this.img = img;
    }


    public Archivio_Utenti getUtente() {
        return utente;
    }


    public void setUtente(Archivio_Utenti utente) {
        this.utente = utente;
    }
    
}
