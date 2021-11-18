package com.example.microservicioRetoFinalClient.services;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import starterRetoFinal.Persona;



public class ListamiembrosService {

Logger logger = LoggerFactory.getLogger(ListamiembrosService.class);
	
	RestTemplate restTemplate = new RestTemplate();
	
	String URL = "http://localhost:8080/";

	public ListamiembrosService()
	{
	}
	
	public void addMiembro(Persona persona)
	{
		String urlOpen
		  = URL + "miembros/add";

		ResponseEntity<String> response
		  = restTemplate.postForEntity(urlOpen,persona ,String.class);
		logger.info("Persona añadida: " + persona.getNombre());
		
	}
	
	public void deleteMiembro(Persona persona)
	{
		String urlDelete
		  = URL + "miembros/delete";

		ResponseEntity<String> response
		  = restTemplate.postForEntity(urlDelete,persona ,String.class);
		logger.info("Persona eliminada: " + persona.getNombre());
		
	}
	
}
