package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.FlightDetails;

public interface IFlightDetailsRepository extends JpaRepository<FlightDetails, Integer>{

}
