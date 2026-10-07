class TV
{
	public void switchON()
	{
		System.out.println("TV is Switched On");
	}
	
	public void changeChannel()
	{
		System.out.println("TV channel is changed");
	}
}

class SmartTV extends TV
{
	@Override
	public void switchON()
	{
		System.out.println("Smart TV is Switched On");
	}
	
	@Override
	public void changeChannel()
	{
		System.out.println("Smart TV channel is changed");
	}
	
	public void browse()
	{
		System.out.println("Smart TV browsing");
	}
}

public class MethodOveridingPractice1
{
	public static void main(String args[])
	{
		SmartTV t = new SmartTV();
		t.switchON();
		t.changeChannel();
		t.browse();
		
		TV t1 = new SmartTV();
		t1.switchON();
		t1.changeChannel();

	}
}