package com.gardhagen.WigellkoncernenCarRental.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//for testing
@Configuration
public class CustomerConfig {

    Customer customer = new Customer(
            1,
            "Alfred",
            "Hitchcock",
            55,
            "alfred@gmail.com"
    );
}
