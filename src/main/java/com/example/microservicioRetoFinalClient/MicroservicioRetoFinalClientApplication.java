package com.example.microservicioRetoFinalClient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.microservicioRetoFinalClient.services.ListamiembrosService;

import starterRetoFinal.Persona;
import starterRetoFinal.PersonaBuilder;

@SpringBootApplication
public class MicroservicioRetoFinalClientApplication implements CommandLineRunner {

	ListamiembrosService service;
	PersonaBuilder builder;
	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicioRetoFinalClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 service = new ListamiembrosService();
		
		builder = new PersonaBuilder();
		
		Persona persona = builder.nombre("pepe").edad(19).tipoMiembro("VIP").build();
		service.addMiembro(persona);
		persona = builder.nombre("juan").edad(20).tipoMiembro("VIP").build();
		service.addMiembro(persona);
		persona = builder.nombre("ramon").edad(11).tipoMiembro("VIP").build();
		service.addMiembro(persona);
		
		persona = builder.nombre("pepe").edad(19).tipoMiembro("VIP").build();

		
		
		service.deleteMiembro(persona);
		
		
	}

}
