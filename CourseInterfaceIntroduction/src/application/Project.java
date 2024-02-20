package application;

import java.security.Provider.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entites.CarRental;
import model.entites.Vehicles;
import model.services.BrazilTaxService;


public class Project {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		/*System.out.println("Enter a data for invoice: ");
		System.out.print("Enter a model car: ");
		String carModel = sc.nextLine();
		System.out.print("Enter a date for finish(dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Enter a date for start(dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental cr = new CarRental(start, finish, new Vehicles(carModel));*/
		
		BrazilTaxService brazilTax = new BrazilTaxService();
		
		System.out.print(brazilTax.tax(100.0));
		
	}
}
