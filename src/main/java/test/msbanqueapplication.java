package test;

import entities.Compte;
import entities.TypeCompte;
import repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

public class msbanqueapplication {
    public static void main(String[] args) {
        SpringApplication.run(msbanqueapplication.class, args);
    }

}