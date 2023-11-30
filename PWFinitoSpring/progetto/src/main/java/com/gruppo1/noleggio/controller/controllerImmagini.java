package com.gruppo1.noleggio.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import java.nio.file.Files;

@RestController
public class controllerImmagini {
    String precorsoCaricamento = "C:/Users/Gianmario/Desktop/PWFinitoSpring/progetto/src/main/resources/img";

    @CrossOrigin
    @PostMapping("/carica")
    public ResponseEntity<String> caricaImmagini(@RequestParam("file") MultipartFile file){
        if(file.isEmpty()){
            return new ResponseEntity<>("Caricamento fallito ", HttpStatus.BAD_REQUEST);
        }
        try {
            String nomeFile = file.getOriginalFilename();
            String percorsoFile = precorsoCaricamento + File.separator + nomeFile;
            File cartella = new File(precorsoCaricamento);
            if(!cartella.exists()){
                cartella.mkdirs();
            }
            file.transferTo(new File(percorsoFile));
            return new ResponseEntity<>("Immagine caricata con successo.", HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Caricamento fallito: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @CrossOrigin
    @GetMapping("/immagini/{nomeImmagine:.+}")
    public ResponseEntity<byte[]> ottieniImmagine(@PathVariable String nomeImmagine){
        try {
            String percorsoImmagine = precorsoCaricamento + File.separator + nomeImmagine;
            byte[] datiImmagine = Files.readAllBytes(new File(percorsoImmagine).toPath());
            HttpHeaders intestazioni = new HttpHeaders();
            intestazioni.setContentType(MediaType.IMAGE_JPEG);
            return new ResponseEntity<>(datiImmagine, intestazioni, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
