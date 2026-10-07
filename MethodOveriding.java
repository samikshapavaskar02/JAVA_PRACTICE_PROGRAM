class Super
{
	public void display()
	{
		System.out.println("Super class display");
	}
}

class Sub extends Super
{
	@Override
	public void display()
	{
		System.out.println("Sub class display");
	}
}

public class MethodOveriding
{
	public static void main(String args[])
	{
		Super sp = new Super();
		sp.display();
		
		Sub sb = new Sub();
		sb.display();
	}
}