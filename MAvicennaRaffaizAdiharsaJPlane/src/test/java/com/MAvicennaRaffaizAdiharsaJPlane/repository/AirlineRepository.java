package com.MAvicennaRaffaizAdiharsaJPlane.repository;

import com.MAvicennaRaffaizAdiharsaJPlane.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {
    Airline findFirstByCompanyName(String companyName);
}
