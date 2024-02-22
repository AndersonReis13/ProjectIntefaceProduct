package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entites.CarRental;
import model.entites.Vehicles;
import model.services.BrazilTaxService;
import model.services.RentalService;


public class Project {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		System.out.println("Enter a data for rent: ");
		System.out.print("Enter a model car: ");
		String carModel = sc.nextLine();
		System.out.print("Enter a date for finish(dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Enter a date for start(dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental cr = new CarRental(start, finish, new Vehicles(carModel));
		
		System.out.println("Enter a price Per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("Enter a price per day: ");
		double pricePerDay = sc.nextDouble();

		
		RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rs.processInvoice(cr);
		
		System.out.println("Invoice: ");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalBalance()));
		
		
		
		sc.close();
	}
}
