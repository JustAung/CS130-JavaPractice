package Inheritance;

 class Circle extends Shape{
  double radius;
  public Circle(double radius) 
  {
		this.radius=radius;
  }
	public double perimeter()
	{
	double peri_circ= 2*Math.PI*radius;
	return peri_circ;
	}
	public double area() 
	{
	double area_circ = Math.PI*Math.pow(radius, 2);
	return area_circ;
  }
}