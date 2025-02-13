package com.example.demo;

import entities.Compte;
import entities.TypeCompte;
import repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository){
		return args -> {
			compteRepository.save(new Compte(null, 9000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 6000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 3000, new Date(), TypeCompte.COURANT));
			compteRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}
}