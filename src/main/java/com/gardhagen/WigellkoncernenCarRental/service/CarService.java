package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.VO.Currency;
import com.gardhagen.WigellkoncernenCarRental.VO.ResponseTemplateVO;
import com.gardhagen.WigellkoncernenCarRental.dto.RentalPriceCurrencyExchangeDTO;
import com.gardhagen.WigellkoncernenCarRental.exception.ResourceNotFoundException;
import com.gardhagen.WigellkoncernenCarRental.models.Car;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService implements CarServiceInterface{
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private RestTemplate restTemplate;
//    @Autowired
//    public CarService(CarRepository carRepository){this.carRepository = carRepository;}

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(long id) {
        return carRepository.findCarById(id);
    }

    @Override
    public Car updateCar(Car car, long id) {
        Car c =carRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Car","Id",id));
        c.setBrand(car.getBrand());
        c.setModelYear(car.getModelYear());
        c.setRentalPrice(car.getRentalPrice());
        carRepository.save(c);
        return c;
    }

    @Override
    public void deleteCar(long id) {
        carRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Car","id",id));
        carRepository.deleteById(id);
    }

    public List<RentalPriceCurrencyExchangeDTO> getRentalPriceses(){

        return carRepository.findAll()
                .stream()
                .map(this::convertVoToDTO)
                .collect(Collectors.toList());

    }
    public RentalPriceCurrencyExchangeDTO convertVoToDTO(Car car){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Currency currency = restTemplate.getForObject("http://localhost:5050/currency/1",Currency.class);
        vo.setCar(car);
        vo.setCurrency(currency);
        RentalPriceCurrencyExchangeDTO rentalPriceCurrencyExchangeDTO = new RentalPriceCurrencyExchangeDTO();
        rentalPriceCurrencyExchangeDTO.setCarId(car.getId());
        rentalPriceCurrencyExchangeDTO.setCarBrand(car.getBrand());
        rentalPriceCurrencyExchangeDTO.setCarModelYear(car.getModelYear());
        rentalPriceCurrencyExchangeDTO.setCarRentalPrice(car.getRentalPrice()/currency.getValue());
        rentalPriceCurrencyExchangeDTO.setCurrencyName(currency.getCurrencyName());
        return rentalPriceCurrencyExchangeDTO;
    }
//    public ResponseTemplateVO getRentalPraices(long id){
//        ResponseTemplateVO vo = new ResponseTemplateVO();
//        Car car = carRepository.findCarById(id);
//        Currency currency = restTemplate.getForObject("http://localhost:5050/currency/" + car.getRentalPrice(),Currency.class);
//        vo.setCar(car);
//        vo.setCurrency(currency);
//        return vo;
//    }


}
