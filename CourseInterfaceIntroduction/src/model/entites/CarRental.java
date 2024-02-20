package model.entites;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CarRental {
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Invoice invoice;
	private Vehicles vehicles;
	
	
	public CarRental() {
		super();
	}


	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicles vehicles) {
		super();
		this.start = start;
		this.finish = finish;
		this.vehicles = vehicles;
	}


	public LocalDateTime getStart() {
		return start;
	}


	public void setStart(LocalDateTime start) {
		this.start = start;
	}


	public LocalDateTime getFinish() {
		return finish;
	}


	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}


	public Vehicles getVehicles() {
		return vehicles;
	}


	public void setVehicles(Vehicles vehicles) {
		this.vehicles = vehicles;
	}
	
	
	
	
	
	
	


 
	
}
