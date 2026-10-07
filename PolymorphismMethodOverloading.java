class Test
{
	public int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		
		return b;
	}
	
	public int max(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>c)
		{
			return b;
		}
		return c;
	}
}

public class PolymorphismMethodOverloading
{
	public static void main(String args[])
	{
		Test t = new Test();
		System.out.println(t.max(10, 5));
        System.out.println(t.max(10, 15, 5));
	}
}