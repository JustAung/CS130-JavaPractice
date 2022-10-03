import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the height");
		int h = scan.nextInt();
		System.out.println("Enter the length");
		int l = scan.nextInt();
		System.out.println("Enter the width");
		int w = scan.nextInt();
		
		System.out.println("The volume is: "+ h * l * w);
		
		
	}

}
