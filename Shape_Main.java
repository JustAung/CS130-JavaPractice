package Inheritance;

public class Shape_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle circ2=new Circle(10);
circ2.setColor("Red");
System.out.println("Circle area: "+circ2.area());
System.out.println("Circle perimeter: "+circ2.perimeter());
System.out.println("Circle color: "+circ2.getColor());

Square sqr1=new Square(10,10);
sqr1.setColor("Yellow");
System.out.println("Square area: "+sqr1.area());
System.out.println("Square perimeter: "+sqr1.perimeter());
System.out.println("Square color: "+sqr1.getColor());

	}

}
