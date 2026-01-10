package com.service;

import java.util.List;
import java.util.Optional;

import com.entity.FlightDetails;

public interface IFlightMgmtService {
	
	public String removeFlightsByIdsInBatch(List<Integer> ids);
	
	public List<FlightDetails> showFlightsByData(FlightDetails data,boolean ascOrder,String ...props);
	
	public Optional<FlightDetails> showById(Integer id);
	
	public FlightDetails fetchById(Integer id);

}
