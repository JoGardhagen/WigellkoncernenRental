package com.gardhagen.WigellkoncernenCarRental;

import com.gardhagen.WigellkoncernenCarRental.models.Customer;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class WigellkoncernenCarRentalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WigellkoncernenCarRentalApplication.class, args);
	}

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CarRepository carRepository;

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer();
		customer.setFirstName("Alfred");
		customer.setLastName("Hitchcock");
		customer.setAge(55);
		customer.setEmail("alfred@gmail.com");

		customerRepository.save(customer);

	}
}
