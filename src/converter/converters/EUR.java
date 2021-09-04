package converter.converters;

import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;

public class EUR {
	
	private final double US_TO_EURO = 0.84;
	private final double JPY_TO_EURO = 0.0077;
	private NumberFormat format = NumberFormat.getNumberInstance();
	private Currency curr = Currency.getInstance(Locale.GERMANY);
	
	public void convertFrom(double before, int user) {
		double after = 0.0;
		USD usd = new USD();
		JPY japa = new JPY();
		
		if (user == 1) {
			after = usd.convertTo(before, 2);
			usd.printUSD(after);
		}
		
		else if (user == 3) {
			after = japa.convertTo(before, 2);
			japa.printJPY(after);
		}
		
	}
	
	public double convertTo(double before, int user) {
		double after = 0.0;
		
		if (user == 1) {
			after = before * US_TO_EURO;
		}
		
		else if (user == 3) {
			after = before * JPY_TO_EURO;
		}
		
		return(after);
	}
	
	public void printEUR(double amount) {
		format.setCurrency(Currency.getInstance(Locale.GERMANY));
		
		System.out.println("Your final converted total is: " + curr.getSymbol() + format.format(amount));
	}
}
