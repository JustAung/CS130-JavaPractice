package Inheritance;

public class Square extends Shape{
double length;
double width;
public Square (double length, double width) 
{
	this.length=length;
	this.width=width;
}
	public double perimeter() {
	double peri_sqr = 2*(length+width);
	return peri_sqr;
	}
	public double area() {
	double area_sqr = length*width;
	return area_sqr;
	}

}
