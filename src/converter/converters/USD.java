package converter.converters;

import java.util.Locale;
import java.util.Currency;
import java.text.NumberFormat;

public class USD {
	
	private final double EURO_TO_USD = 1.19;
	private final double JPY_TO_USD = 0.0091;
	private NumberFormat format = NumberFormat.getNumberInstance();
	private Currency curr = Currency.getInstance(Locale.US);
	
	public void convertFrom(double before, int user) {	
		double after = 0.0;
		EUR euro = new EUR();
		JPY japa = new JPY();
		
		if (user == 2) {
			after = euro.convertTo(before, 1);
			euro.printEUR(after);
		}
		
		else if (user == 3) {
			after = japa.convertTo(before, 1);
			japa.printJPY(after);
		}
	}
	
	public double convertTo(double before, int user) {
		double after = 0.0;
		
		if (user == 2) {
			after = before * EURO_TO_USD;
		}
		
		else if (user == 3) {
			after = before * JPY_TO_USD;
		}
		
		return(after);
	}
	
	public void printUSD(double amount) {
		format.setCurrency(Currency.getInstance(Locale.US));
		
		System.out.println("Your final converted total is: " + curr.getSymbol() + format.format(amount));
	}
}
