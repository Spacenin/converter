package converter.main;

import java.util.Scanner;
import java.util.Locale;
import java.util.Currency;

public class GetStuff {
	
	private Scanner sc = new Scanner(System.in);
	
	public double getAmount(int choice) {
		double userAmount = 0.0;
		Currency curr;
		Locale place;
		
		System.out.print("Enter the amount you would like to convert: ");
		
		if (choice == 1) {
			place = Locale.US;
			curr = Currency.getInstance(place);
			
			System.out.print(curr.getSymbol(place));
			userAmount = sc.nextFloat();
		}
		
		else if (choice == 2) {
			place = Locale.UK;
			curr = Currency.getInstance(place);
			
			System.out.print(curr.getSymbol(place));
			userAmount = sc.nextFloat();
		}
		
		else if (choice == 3) {
			place = Locale.JAPAN;
			curr = Currency.getInstance(place);
			
			System.out.print(curr.getSymbol(place));
			userAmount = sc.nextFloat();
		}
				
		return(userAmount);
	}
	
	public int getChoice() {
		int user = 0;
		
		System.out.println("Enter what currency you would like to convert from: ");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. JPY");
		System.out.println("4. Get me out of here!");
		System.out.print("--> ");
		
		user = sc.nextInt();
		
		return(user);
	}
	
	public int getChoice2(int firstChoice) {
		int user = 0;
		
		System.out.println("Enter what currency you would like to convert to: ");
		
		if (firstChoice == 1) {
			System.out.println("2. EUR");
			System.out.println("3. JPY");
			System.out.print("--> ");
			
			user = sc.nextInt();
		}
		
		else if (firstChoice == 2) {
			System.out.println("1. USD");
			System.out.println("3. JPY");
			System.out.print("--> ");
			
			user = sc.nextInt();
		}
		
		else if (firstChoice == 3) {
			System.out.println("1. USD");
			System.out.println("2. EUR");
			System.out.print("--> ");
			
			user = sc.nextInt();
		}
		
		return(user);
	}
}
