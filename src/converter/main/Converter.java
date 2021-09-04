package converter.main;

import converter.converters.*;

public class Converter {
	
	public static void main(String[] args) {
		GetStuff getter = new GetStuff();
		
		int user = 0;
		int user2 = 0;
		boolean loop = true;
		double before = 0.0;
		
		System.out.println("Welcome to the Java Currency Converter!");
		System.out.println();
		
		while (loop) {
			user = getter.getChoice();
			System.out.println();
			
			if (user == 4) {
				System.out.println("Thank you for using the Currency Converter!");
				
				break;
			}
			
			before = getter.getAmount(user);
			System.out.println();
			
			user2 = getter.getChoice2(user);
			System.out.println();
			
			
			if (user == 1) {
				USD us = new USD();
				
				us.convertFrom(before, user2);
			}
			
			else if (user == 2) {
				EUR euro = new EUR();
				
				euro.convertFrom(before, user2);
			}
			
			else if (user == 3) {
				JPY japa = new JPY();
				
				japa.convertFrom(before, user2);
			}
			
			else {
				System.out.println("Not a choice! Please choose again!");
				System.out.println();
			}
		}		
	}
}


