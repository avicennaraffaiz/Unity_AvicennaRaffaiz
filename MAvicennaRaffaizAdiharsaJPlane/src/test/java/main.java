package com.MAvicennaRaffaizAdiharsaJPlane;

import com.MAvicennaRaffaizAdiharsaJPlane.service.AccountService;
import com.MAvicennaRaffaizAdiharsaJPlane.service.AirlineService;
import com.MAvicennaRaffaizAdiharsaJPlane.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MuhammadAvicennaRaffaizAdiharsaJPlaneApplication {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AirlineService airlineService;

    public static void main(String[] args) {
        SpringApplication.run(MAvicennaRaffaizAdiharsaJPlaneApplication.class, args);
    }


    @Bean
    public ApplicationRunner initializer() {
        return args -> {

            List<Account> accounts = accountService.getAllUsers();
            System.out.println("All accounts:");
            accounts.forEach(account -> System.out.println(account));


            Long accountId = 1L;
            String username = "raffa";
            String password = "emc";
            String companyName = "Netlab Airlines";

            Airline airline = airlineService.addAirline(accountId, username, password, companyName);


            airlineService.addPlane(airline.getId(), "KL844", City.JAKARTA, City.BANDUNG);


            System.out.println("Added airline:");
            System.out.println(airlineService.getAirline(airline.getId()));


            System.out.println("All airlines:");
            List<Airline> airlines = airlineService.getAllAirlines();
            airlines.forEach(x -> System.out.println(x));
        };
    }
}