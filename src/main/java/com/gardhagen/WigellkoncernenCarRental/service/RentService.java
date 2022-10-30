package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.VO.Currency;
import com.gardhagen.WigellkoncernenCarRental.VO.ResponseTemplateRentalVO;
import com.gardhagen.WigellkoncernenCarRental.dto.OrderCurrencyExchangeDTO;
import com.gardhagen.WigellkoncernenCarRental.exception.ResourceNotFoundException;
import com.gardhagen.WigellkoncernenCarRental.models.Rent;
import com.gardhagen.WigellkoncernenCarRental.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentService implements RentServiceInterface{
    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Rent addRent(Rent rent) {
        return rentRepository.save(rent);
    }

    @Override
    public List<Rent> getAllRents() {
        return rentRepository.findAll();
    }

    @Override
    public Rent getRentById(long id) {
        return null;
    }

    @Override
    public Rent updateRent(Rent rent, long id) {
        Rent rentOrder = rentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Rent","Id",id));
        rentOrder.setCar(rent.getCar());
        rentOrder.setCustomer(rent.getCustomer());
        rentOrder.setRentalDays(rent.getRentalDays());
        rentOrder.setActive(rent.isActive());
        return rentOrder;
    }
    @Override
    public Rent cancelOrder(Rent rent, long id) {
        Rent rentOrder = rentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Rent","Id",id));
        rentOrder.setCar(rent.getCar());
        rentOrder.setCustomer(rent.getCustomer());
        rentOrder.setRentalDays(rent.getRentalDays());
        rentOrder.setActive(rent.isActive());
        return rentOrder;
    }

    @Override
    public void deleteRent(long id) {
    }
    //MicroService Call here! ///
    public List<OrderCurrencyExchangeDTO> getTotalPriceExchanged(){
        return rentRepository.findAll()
                .stream()
                .map(this::convertVoToDTO)
                .collect(Collectors.toList());
    }
    public OrderCurrencyExchangeDTO convertVoToDTO(Rent rent){
        ResponseTemplateRentalVO vo = new ResponseTemplateRentalVO();
        Currency currency = restTemplate.getForObject("http://localhost:5050/currency/1",Currency.class);// call here
        vo.setCurrency(currency);
        vo.setRent(rent);
        OrderCurrencyExchangeDTO orderCurrencyExchangeDTO = new OrderCurrencyExchangeDTO();
        orderCurrencyExchangeDTO.setRentalId(rent.getId());
        orderCurrencyExchangeDTO.setCustumerId(rent.getCustomer().getId());
        orderCurrencyExchangeDTO.setCustomerFirstName(rent.getCustomer().getFirstName());
        orderCurrencyExchangeDTO.setCustomerLastName(rent.getCustomer().getLastName());
        orderCurrencyExchangeDTO.setCarId(rent.getCar().getId());
        orderCurrencyExchangeDTO.setCarBrand(rent.getCar().getBrand());
        orderCurrencyExchangeDTO.setCarRentalCost(rent.getCar().getRentalPrice());
        orderCurrencyExchangeDTO.setRentalDays(rent.getRentalDays());
        orderCurrencyExchangeDTO.setTotalCost(rent.getCar().getRentalPrice()*rent.getRentalDays());
        orderCurrencyExchangeDTO.setCurrencyName(currency.getCurrencyName());
        orderCurrencyExchangeDTO.setCurrencyValue(currency.getValue());
        orderCurrencyExchangeDTO.setExchangedValue((rent.getCar().getRentalPrice()*rent.getRentalDays())/currency.getValue());
        orderCurrencyExchangeDTO.setOrderdate(rent.getBookingDate());

        return orderCurrencyExchangeDTO;
    }
    //////////////////////////////////////////////////////////////////////////////

}
