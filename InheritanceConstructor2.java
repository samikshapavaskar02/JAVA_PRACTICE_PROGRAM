class Rectangle
{
	int length;
	int breadth;
	public Rectangle()
	{
		length = 1;
		breadth = 1;
	}
	
	public Rectangle(int l,int b)
	{
		length = l;
		breadth = b;
	}
}

class Cuboid extends Rectangle
{
	int height;
	public Cuboid()
	{
		height = 1;
	}
	
	public Cuboid(int h)
	{
		height = h;
	}
	
	public Cuboid(int l,int b,int h)
	{
		super(l,b);
		height = h;
	}
	
	public int volume()
	{
		return length*breadth*height;
	}
}

public class InheritanceConstructor2
{
	public static void main(String args[])
	{
		Cuboid c1 = new Cuboid();
		System.out.println("Volume when there is non parameterized constructor : "+c1.volume());
		Cuboid c2 = new Cuboid(10);
		System.out.println("Volume when there is one parameterized constructor : "+c2.volume());
		Cuboid c3 = new Cuboid(5,3,10);
		System.out.println("Volume when there are (super keyword) all parameterized constructor : "+c3.volume());	
	}
}