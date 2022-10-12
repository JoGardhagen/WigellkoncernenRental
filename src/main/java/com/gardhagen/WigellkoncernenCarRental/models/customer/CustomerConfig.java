package com.gardhagen.WigellkoncernenCarRental.models.customer;

import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


//for testing
@Configuration
public class CustomerConfig {

 @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return  args -> {
            Customer alfred = new Customer(
                    "Alfred",
                    "Hitchcock",
                    55,
                    "alfred@gmail.com"
            );
            Customer lundgren = new Customer(
                    "Dolph",
                    "Lundgren",
                    75,
                    "lundgren@gmail.com"
            );
            repository.saveAll(List.of(alfred,lundgren));
        };
    }

}
