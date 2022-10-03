import java.util.Scanner;
import java.lang.Math;


public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value x");
		int x = scan.nextInt();
		int p1 = 1/2;
		double p2 = Math.pow(x, 3);
		double p3 = Math.pow(x, 2);
		double y = p1 * p2 - p3 +1;
		System.out.println("The value for y is: "+y);
		
	}

}
