class Parent
{
	public Parent()
	{
		System.out.println("Non Parameterized Parent Constructor");
	}
	public Parent(int x)
	{
		System.out.println("Parameterized Parent Constructor "+x);
	}
}

class Child extends Parent
{
	public Child()
	{
		System.out.println("Child Constructor");
	}
	public Child(int x,int y)
	{
		super(x);
		System.out.println("2 Parameters "+x+" and "+y);
	}
}

public class InheritanceConstructor1
{
	public static void main(String args[])
	{
		Child c = new Child(10,20);
		Child c1 = new Child();
	}
}