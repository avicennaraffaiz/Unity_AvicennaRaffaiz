package com.MAvicennaRaffaizAdiharsaJPlane;

import com.MAvicennaRaffaizAdiharsaJPlane.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class MAvicennaRaffaizAdiharsaJPlaneApplication {

    @Autowired
    private AccountService accountService;


    public static void main(String[] args) {
        SpringApplication.run(MAvicennaRaffaizAdiharsaJPlaneApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer (){
        return args -> {
            //accountService.registerAccount("Raffa", "kivotos");
            List<Account> accounts = accountService.getAllUsers();
            accounts.forEach(account -> System.out.println(account));
        };
    }
}
