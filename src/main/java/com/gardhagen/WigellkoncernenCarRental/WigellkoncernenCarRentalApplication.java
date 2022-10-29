package com.gardhagen.WigellkoncernenCarRental;

import com.gardhagen.WigellkoncernenCarRental.models.Address;
import com.gardhagen.WigellkoncernenCarRental.models.Car;
import com.gardhagen.WigellkoncernenCarRental.models.Customer;
import com.gardhagen.WigellkoncernenCarRental.models.Rent;
import com.gardhagen.WigellkoncernenCarRental.repository.AddressRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication

public class WigellkoncernenCarRentalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WigellkoncernenCarRentalApplication.class, args);
	}

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private RentRepository rentRepository;

	@Bean
//	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
//	// För uppfyllnad;
	@Override
	public void run(String... args) throws Exception {

//		Address address = new Address();
//		address.setLocationName("Arvika");
//		address.setPostalNr(44344);
//		addressRepository.save(address);
//
//		Customer customer = new Customer();
//		customer.setFirstName("Nicola");
//		customer.setLastName("Tesla");
//		customer.setAge(81);
//		customer.setEmail("nicola@gmail.com");
//		customer.setAddress(address);
//
//		customerRepository.save(customer);
//
//		Car car = new Car();
//		car.setBrand("Tesla");
//		car.setModelYear(2019);
//		car.setRentalPrice(800.0);
//
//		carRepository.save(car);
//
//		Rent rent = new Rent();
//		rent.setCustomer(customer);
//		rent.setCar(car);
//		rent.setRentalDays(3);
//		rentRepository.save(rent);

	}
}
