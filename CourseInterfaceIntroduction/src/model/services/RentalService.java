package model.services;

<<<<<<< HEAD
import java.time.Duration;

import model.entites.CarRental;
import model.entites.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService taxService;

=======
public class RentalService {
  private Double pricePerHour;
	private Double pricePerDay;
  
	
	private BrazilTaxService taxService;

>>>>>>> 4d37df98103259c241a3243e2a44fd996e563dff
	
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
<<<<<<< HEAD
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes/60.00;
		
		
		double basicPayment;
		if(hours <= 12) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}else {
			basicPayment = pricePerDay * Math.ceil(hours/24.00); 
		}		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
=======
		carRental.setInvoice(new Invoice(50.0, 10.0));
>>>>>>> 4d37df98103259c241a3243e2a44fd996e563dff
	}
	
}
