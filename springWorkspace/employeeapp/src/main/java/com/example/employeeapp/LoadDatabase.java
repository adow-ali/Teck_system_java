package com.example.employeeapp;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.classic.Logger;
import entity.EmployeeEntity;
import repository.EmployeeRepository;


@Configuration
public class LoadDatabase {

    private static final Logger log = (Logger) LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository){
        EmployeeEntity e1 = new EmployeeEntity();
        e1.setName("Erik Taylor");
        e1.setRole("Dev");
        EmployeeEntity e2 = new EmployeeEntity();
        e2.setName("Jane Doe");
        e2.setRole("Manager");
        return args -> {
            log.info("Preloading " + employeeRepository.save(e1));
            log.info("Preloading " + employeeRepository.save(e2));
        };

    }
}