package com.MAvicennaRaffaizAdiharsaJPlane.service;

import com.MAvicennaRaffaizAdiharsaJPlane.*;
import com.MAvicennaRaffaizAdiharsaJPlane.repository.AirlineRepository;
import com.MAvicennaRaffaizAdiharsaJPlane.repository.AccountRepository;
import com.MAvicennaRaffaizAdiharsaJPlane.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PlaneRepository planeRepository;


    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }


    public Airline getAirline(Long airlineID) {
        Airline airline = airlineRepository.findById(airlineID)
                .orElseThrow(() -> new RuntimeException("Airline not found"));
        return airline;
    }

   
    public Airline addAirline(Long accountID, String username, String password, String companyName) {

        Account admin = accountRepository.findById(accountID)
                .orElseThrow(() -> new RuntimeException("Admin account not found"));


        if (!admin.getUsername().equals(username) || !admin.getPassword().equals(password)) {
            throw new RuntimeException("Invalid username or password");
        }


        Airline newAirline = new Airline(admin, companyName);

        return airlineRepository.save(newAirline);
    }


    public Plane addPlane(Long airlineID, String code, City departureCity, City arrivalCity) {

        Airline airline = airlineRepository.findById(airlineID)
                .orElseThrow(() -> new RuntimeException("Airline not found"));


        Plane plane = new Plane(code, departureCity, arrivalCity);


        airline.setPlane(plane);


        planeRepository.save(plane);


        airlineRepository.save(airline);


        return plane;
    }
}