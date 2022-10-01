package com.gardhagen.WigellkoncernenCarRental;

import com.gardhagen.WigellkoncernenCarRental.models.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WigellkoncernenCarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(WigellkoncernenCarRentalApplication.class, args);
	}


	// for testing
	@GetMapping
	public Customer customer(){

		Customer customer = new Customer(
				1,
				"Alfred",
				"Hitchcock",
				55,
				"alfred@gmail.com"
		);
		return customer;
	}
}
