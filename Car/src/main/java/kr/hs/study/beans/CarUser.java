package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CarUser {
	private String owner;
	private String color;
	
	@Autowired
	private Car car_type;
	
	
	@Autowired
	public CarUser(@Value("강은별")String owner, @Value("검정색")String color, Car car_type) {
		super();
		this.owner = owner;
		this.color = color;
		this.car_type = car_type;
	}

	public String getOwner() {
		return owner;
	}

	public String getColor() {
		return color;
	}

	public Car getCar_type() {
		return car_type;
	}
	
	
}
