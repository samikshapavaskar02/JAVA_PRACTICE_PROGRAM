class Circle
{
	public double radius;
	
	public double area()
	{
		return 3.14*radius*radius;
	}
	
	public double circumference()
	{
		return 2*3.14*radius;
	}
}

public class CircleDemo
{
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.radius = 7;
		c2.radius = 5;
		
		System.out.println(c1.area());
		System.out.println(c1.circumference());
		
		System.out.println("Area of Circle is : " +c2.area());
		System.out.println("Circumference of Circle is :" +c2.circumference());

	}
}