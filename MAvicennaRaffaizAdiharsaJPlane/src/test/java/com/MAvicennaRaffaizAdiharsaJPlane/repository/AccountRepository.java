package com.MAvicennaRaffaizAdiharsaJPlane.repository;

import com.MAvicennaRaffaizAdiharsaJPlane.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByUsername(String username);
    Account findByUsernameAndPassword(String username, String password);
}
