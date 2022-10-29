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
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication

public class WigellkoncernenCarRentalApplication {

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
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
//	// För uppfyllnad;
//	@Override
//	public void run(String... args) throws Exception {
//
//		Address address = new Address();
//		address.setLocationName("Örebro");
//		address.setPostalNr(1234);
//		addressRepository.save(address);
//
//		Customer customer = new Customer();
//		customer.setFirstName("Alfred");
//		customer.setLastName("Hitchcock");
//		customer.setAge(55);
//		customer.setEmail("alfred@gmail.com");
//		customer.setAddress(address);
//
//		customerRepository.save(customer);
//
//		Car car = new Car();
//		car.setBrand("Opel");
//		car.setModelYear(1994);
//		car.setRentalPrice(400.0);
//
//		carRepository.save(car);
//
//		Rent rent = new Rent();
//		rent.setCustomer(customer);
//		rent.setCar(car);
//		rentRepository.save(rent);

//	}
}
