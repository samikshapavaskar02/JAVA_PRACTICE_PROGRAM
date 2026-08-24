class Rectangle
{
	private double length;
	private double breadth;
	
	public double getlength()
	{
		return length;
	}
	
	public double getbreadth()
	{
		return breadth;
	}
	
	public void setlength(double l)
	{
		if(l>0)
		{
			length = l;
		}
		else
		{
			length = 0;
		}
	}
	
	public void setbreadth(double b)
	{	
		if(b>0)
		{
			breadth = b;
		}
		else
		{
			breadth = 0;
		}
	}
	
	
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

public class DataHidingDemo
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		
		r1.setlength(5);
		r1.setbreadth(7);
		
		System.out.println("Area of Rectangle: "+r1.area());
		System.out.println("Perimeter of Rectangle: "+r1.perimeter());
		System.out.println("Is it Square : "+r1.isSquare());
	}
}