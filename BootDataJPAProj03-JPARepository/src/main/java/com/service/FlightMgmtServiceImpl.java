package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.entity.FlightDetails;
import com.repository.IFlightDetailsRepository;

@Service
public class FlightMgmtServiceImpl implements IFlightMgmtService {

	@Autowired
	private IFlightDetailsRepository repository;

	@Override
	public String removeFlightsByIdsInBatch(List<Integer> ids) {
		List<FlightDetails> list = repository.findAllById(ids);
		if(list.size()!=0) {
		repository.deleteAllByIdInBatch(ids);
		return list.size()+" Records are Deleted Successfully";
		}
		return "No Record Available";
	}

	@Override
	public List<FlightDetails> showFlightsByData(FlightDetails data, boolean ascOrder, String... props) {
		
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		
		Example<FlightDetails> example=Example.of(data);
		
		List<FlightDetails> list = repository.findAll(example, sort);
		return list;
	}

	@Override
	public Optional<FlightDetails> showById(Integer id) {
		
		return repository.findById(id);
	}

	@Override
	public FlightDetails fetchById(Integer id) {
		FlightDetails proxy = repository.getReferenceById(id);
		return proxy;
	}

	
	
   
}
