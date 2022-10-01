package com.gardhagen.WigellkoncernenCarRental.models.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//for testing
@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return  args -> {
            Customer alfred = new Customer(
                    1,
                    "Alfred",
                    "Hitchcock",
                    55,
                    "alfred@gmail.com"
            );
            Customer lundgren = new Customer(
                    2,
                    "Dolph",
                    "Lundgren",
                    75,
                    "lundgren@gmail.com"
            );
        };
    }

}
