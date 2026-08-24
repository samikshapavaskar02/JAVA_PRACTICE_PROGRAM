public class MethodOverloadArea
{
	static double area(double radius)
	{
		return Math.PI * radius *radius;
	}
	
	static double area(double length, double breadth)
	{
		return length * breadth;
	}
	
	public static void main(String args[])
	{
		double circle = area(5.0);
		double rectangle = area(10.5,15.5);
		
		System.out.println("Area of Circle is : "+circle);
		System.out.println("Area of Rectangle is : "+rectangle);
	}
}