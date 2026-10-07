abstract class Shape
{
	abstract public float perimeter();
	abstract public float area();
}

class Circle extends Shape
{
	float radius;
	
	@Override
	public float perimeter()
	{
		return 2*3.14f*radius;
	}
	
	@Override
	public float area()
	{
		return 3.14f*radius*radius;

	}
}

class Rectangle extends Shape
{
	float length;
	float breadth;
	
	@Override
	public float perimeter()
	{
		return 2*(length+breadth);
	}
	
	@Override
	public float area()
	{
		return length*breadth;
	}
}

public class AbstractShape
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.length = 10;
		r.breadth = 5;
		
		Circle c = new Circle();
		c.radius = 5;
		
		System.out.println("Area of Rectangle is : "+r.area());
		System.out.println("Perimeter of Rectangle is : "+r.perimeter());
		System.out.println("Area of Circle is : "+c.area());
		System.out.println("Perimeter of Circle is : "+c.perimeter());
	}
}