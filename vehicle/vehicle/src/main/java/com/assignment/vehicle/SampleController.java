package com.assignment.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	private CarRepo car;
	
	@GetMapping("/car")
	public List<CarEntity> joincar(){
		return car.getjoincar();
				}
	@Autowired
	private BikeRepo bike;
	@GetMapping("/bike")
	public List<BikeEntity> joinbike(){
		return bike.getjoinbike();
	}
	@Autowired
	private TruckRepo truck;
	@GetMapping("/truck")
	public List<TruckEntity> jointruck(){
		return truck.getjointruck();
	
}
}

