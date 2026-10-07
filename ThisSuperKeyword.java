class Rectangle
{
	int length;
	int breadth;
	int x =10;
	
	public Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth= b;
	}
	
	public void display()
	{
		System.out.println("Length : "+this.length);
		System.out.println("Breadth : "+this.breadth);
	}
	
	public int perimeter()
	{
		return 2*(length+breadth);
	}
}

class Cuboid extends Rectangle
	{
		int height;
		int x = 20;
		Cuboid(int l,int b,int h)
		{
			super(l,b);
			height = h;
		}
		public void displayCuboid()
		{
			System.out.println("Varaible from Parent class(Rectangle) : "+super.x);
			System.out.println("Variable from child class : "+x);
		}
	}

public class ThisSuperKeyword
{
	public static void main(String args[])
	{
		System.out.println("Length and Breadth of Rectangle 1 is :");
		Rectangle r1 = new Rectangle(10,20);
		r1.display();
		System.out.println("Perimeter of rectangle 1 is :"+r1.perimeter());
		
		System.out.println("Length and Breadth of Rectangle 2 is :");
		Rectangle r2 = new Rectangle(11,21);
		r2.display();
		System.out.println("Perimeter of rectangle 2 is :"+r2.perimeter());
		
		Cuboid c = new Cuboid(10,15,20);
		c.displayCuboid();
	}
}