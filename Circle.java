
public class Circle {
private double radius;
//Constructor

public Circle(double radius) {
	this.radius=radius;
}
//Getter

public double getRadius() {
	return radius;
}
//Setter
public void setRadius(double radius) {
	this.radius=radius;
}
public double areaCircle() {
	double area=Math.PI*Math.pow(radius, 2);
	return area;
}
public double periCircle() {
	double peri=2*Math.PI*radius;
	return peri;
}
//Main Method
public static void main(String[] args) {
	Circle circle1 = new Circle(10);
	System.out.println("The area of the circle is: "+(circle1.areaCircle()));
	System.out.println("The perimeter of the circle is: "+circle1.periCircle());
	
	circle1.setRadius(25);
	System.out.println("The new area of the circle is: "+(circle1.areaCircle()));	
	System.out.println("The new perimeter of the circle is: "+circle1.periCircle());

}
}
