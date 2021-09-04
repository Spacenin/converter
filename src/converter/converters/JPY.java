package converter.converters;

import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;

public class JPY {
	
	private final double USD_TO_JPY = 109.64;
	private final double EURO_TO_JPY = 130.42;
	private NumberFormat format = NumberFormat.getNumberInstance();
	private Currency curr = Currency.getInstance(Locale.JAPAN);
	
	public void convertFrom(double before, int user) {
		double after = 0.0;
		EUR euro = new EUR();
		USD usd = new USD();
		
		if (user == 1) {
			after = usd.convertTo(before, 3);
			usd.printUSD(after);
		}
		
		else if (user == 2) {
			after = euro.convertTo(before, 3);
			euro.printEUR(after);
		}
	}
	
	public double convertTo(double before, int user) {
		double after = 0.0;
		
		if (user == 1) {
			after = before * USD_TO_JPY;
		}
		
		else if (user == 2) {
			after = before * EURO_TO_JPY;
		}
		
		return(after);	
	}
	
	public void printJPY(double amount) {
		format.setCurrency(Currency.getInstance(Locale.JAPAN));
		
		System.out.println("Your final converted total is: " + curr.getSymbol() + format.format(amount));
	}
}
