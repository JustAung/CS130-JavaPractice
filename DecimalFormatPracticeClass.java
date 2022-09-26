import java.util.Scanner;
import java.text.DecimalFormat;


public class DecimalFormatPracticeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the sphere: ");
		double radius = scan.nextDouble();
		
		double surfacearea = 4 * Math.PI * Math.pow(radius, 2);
		double volume = 4/3 * Math.PI * Math.pow(radius, 3);
		
		System.out.println("The surface area of the sphere is: "+surfacearea);
		System.out.println("The volume of the sphere is: " +volume);
		
		DecimalFormat format1 = new DecimalFormat("0.###");
		
		System.out.println("The formatted surface area of the sphere is: "+format1.format(surfacearea));
		System.out.println("The formatted volume of the sphere is: " +format1.format(volume));

		
		
		
	}

}
