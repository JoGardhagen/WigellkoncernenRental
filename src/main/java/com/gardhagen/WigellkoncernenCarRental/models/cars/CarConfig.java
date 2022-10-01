package com.gardhagen.WigellkoncernenCarRental.models.cars;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
//for testing
@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner1(CarRepository repository){
        return args -> {
            Car volvo = new Car(
                    "Volvo",
                    "Gasoline",
                    "Green",
                    1995,
                    true
            );
            Car bmw = new Car(
                    "BMW",
                    "Disel",
                    "Gray",
                    2012,
                    false
            );
            repository.saveAll(List.of(volvo,bmw));
        };
    }
}
