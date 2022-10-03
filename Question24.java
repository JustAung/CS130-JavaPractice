import java.text.NumberFormat;
import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		NumberFormat p = NumberFormat.getPercentInstance();
		NumberFormat c = NumberFormat.getCurrencyInstance();

		System.out.println("Print the value x");
		int x = scan.nextInt();
		final double TAX_RATE = 0.06;
		
		double total_tax = x * TAX_RATE;
		
		double total_cost = x + total_tax;
		
		System.out.println( "Tax subtotal is : "+c.format(total_tax) +" due to kentucky tax rate of " +p.format(TAX_RATE));
		System.out.println("I have spent on food a total of: " +c.format(total_cost));


	}

}
