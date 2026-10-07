abstract class KFC
{
	public KFC()
	{
		System.out.println("Main Branch Of KFC");
	}
	
	public void makeVegBurger()
	{
		System.out.println("Veg Burger is ready");
	}
	
	abstract void billing();
	abstract void offer();
}

class MyKFC extends KFC
{
	public MyKFC()
	{
		System.out.println("MyKFC Franchise");
	}
	
	public void billing()
	{
		System.out.println("Billing is Done");
	}
	
	public void offer()
	{
		System.out.println("10% off on order above 299");
	}
	
	public void festiveOffer()
	{
		System.out.println("20% off on 13th,14th and 15th August");
	}
}

public class AbstractKFC
{
	public static void main(String args[])
	{
		MyKFC k = new MyKFC();
		k.makeVegBurger();
		k.billing();
		k.offer();
		k.festiveOffer();
		
		System.out.println(" ");
		
		KFC k1 = new MyKFC();
		k1.makeVegBurger();
		k1.billing();
		k1.offer();
	}
}