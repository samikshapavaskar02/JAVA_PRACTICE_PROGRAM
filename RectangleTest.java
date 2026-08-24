class Rectangle
{
	private double length;
	private double breadth;
	
	public Rectangle()
	{
		length = 1;
		breadth = 1;
	}
	
	public Rectangle(double l,double b)
	{
		length = l;
		breadth = b;
	}
	
	public Rectangle(double s)
	{
		length = breadth = s;
	}
	
	public double area()
	{
		return length*breadth;
	}
}

public class RectangleTest
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10,5);
		Rectangle r3 = new Rectangle(5);
		
		System.out.println("Area of Rectangle: "+r1.area());
		System.out.println("Area of Rectangle: "+r2.area());
		System.out.println("Area of Rectangle: "+r3.area());
	}
}