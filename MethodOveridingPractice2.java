class Car
{
	public void start()
	{
		System.out.println("Car Started");
	}
	
	public void accelerate()
	{
		System.out.println("Car is Accelerated");
	}
	
	public void changeGear()
	{
		System.out.println("Car Gear Changed");
	}
}

class LuxaryCar extends Car
{
	public void changeGear()
	{
		System.out.println("Automatic Gear Changed");
	}
	
	public void sunRoof()
	{
		System.out.println("Sun Roof Is Opened");
	}
}

public class MethodOveridingPractice2
{
	public static void main(String args[])
	{
		Car c = new Car();
		c.start();
		c.accelerate();
		c.changeGear();
		
		System.out.println(" ");
		
		LuxaryCar l = new LuxaryCar();
		l.start();
		l.accelerate();
		l.changeGear();
		l.sunRoof();
	}
}