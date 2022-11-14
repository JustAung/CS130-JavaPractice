package Inheritance;

 class Circle extends Shape{
  double radius;
  public Circle(double radius) {
		this.radius=radius;
		
	double perimeter = 2*Math.PI*radius;
	double area = Math.PI*radius*radius;
	
	System.out.println("Perimeter of this circle is: "+perimeter);
	System.out.println("Area of this circle is: "+area);
  }
}