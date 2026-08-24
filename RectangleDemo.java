class Rectangle
{
	public double length;
	public double breadth;
	
	public double area()
	{
		return length*breadth;
	}
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	
	public boolean isSquare()
	{
		if(length==breadth)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class RectangleDemo
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.length = 5;
		r1.breadth = 7;
		
		r2.length = 5;
		r2.breadth = 5;
		
		System.out.println("Area of Rectangle: "+r1.area());
		System.out.println("Perimeter of Rectangle: "+r1.perimeter());
		System.out.println("Is it Square : "+r1.isSquare());

		System.out.println("Area of Rectangle: "+r2.area());
		System.out.println("Perimeter of Rectangle: "+r2.perimeter());
		System.out.println("Is it Square : "+r2.isSquare());
	}
}