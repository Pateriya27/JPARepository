package com.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.entity.FlightDetails;
import com.service.FlightMgmtServiceImpl;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private FlightMgmtServiceImpl service;

	@Override
	public void run(String... args) throws Exception {

//		try {
//
//			String msg = service.removeFlightsByIdsInBatch(List.of(1000,1001,1002,1200));
//			System.out.println(msg);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			FlightDetails data=new FlightDetails();
//			data.setCompany("AIR INDIA");
//			List<FlightDetails> list = service.showFlightsByData(data, false, "type","capacity");
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//		Optional<FlightDetails> opt = service.showById(1020);
//		
//		     if(opt.isPresent()) {
//		    	// System.out.println(opt.get());
//		     }else {
//				System.out.println("No Flight Available");
//			}
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		try {
			FlightDetails proxy = service.fetchById(1020);
			System.out.println("----------------------------");
			System.out.println(proxy.getFno());
			System.out.println(proxy.getCapacity());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
