package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.facultad;

import com.example.demo.service.facultadservice;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/facultad")
public class facultadcontroller {
	 @Autowired
	    private facultadservice service;

	    @GetMapping
	    public ResponseEntity<List<facultad>> readAll() {
	        try {
	            List<facultad> lista = service.readAll();
	            if (lista.isEmpty()) {
	                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
	            } else {
	                return new ResponseEntity<>(lista, HttpStatus.OK);
	            }
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	    @PostMapping
	    public ResponseEntity<facultad> create(@Valid @RequestBody facultad obj) {
	        try {
	        	facultad objeto = service.create(obj);
	            return new ResponseEntity<>(objeto, HttpStatus.CREATED);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<facultad> getfacultadeById(@PathVariable Long id) {
	        try {
	            Optional<facultad> objeto = service.read(id);
	            if (objeto.isPresent()) {
	                return new ResponseEntity<>(objeto.get(), HttpStatus.OK);
	            } else {
	                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	            }
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deletefacultad(@PathVariable Long id) {
	        try {
	            service.delete(id);
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	    @PutMapping("/{id}")
	  	public ResponseEntity<facultad> updatefacultad(@PathVariable Long id, @Valid @RequestBody facultad obj) {
	  	    Optional<facultad> objeto = service.read(id);
	  	    if (objeto.isPresent()) {
	  	        // Aquí se asume que el servicio actualiza el objeto y lo retorna
	  	    	facultad actualizado = service.update(obj);
	  	        return new ResponseEntity<>(actualizado, HttpStatus.OK);
	  	    } else {
	  	        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 si no se encuentra el objeto
	  	    }		
	  	}
}
