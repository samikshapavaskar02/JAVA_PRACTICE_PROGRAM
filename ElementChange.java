public class ElementChange
{
	static void change(int x,int value)
	{
		x = value;
	}
	
	public static void main(String args[])
	{
		int x = 10;
		change(x,20);
		System.out.println("Value of x:" +x);
	}
}