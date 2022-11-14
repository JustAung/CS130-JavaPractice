package Inheritance;

public class Square {
double length;
double width;
public Square (double length, double width) {
	this.length=length;
	this.width=width;
	
	double perimeter = length+length+width+width;
	double area = 2*length*2*width;

	System.out.println("Perimeter of this square is: "+perimeter);
	System.out.println("Area of this square is: "+area);
}

}
