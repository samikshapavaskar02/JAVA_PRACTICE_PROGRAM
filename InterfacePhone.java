class Phone
{
	public void call()
	{
		System.out.println("Phone call");
	}
	public void sms()
	{
		System.out.println("Phone sending SMS");
	}
}

interface ICamera
{
	void click();
	void record();
}

interface IMusicPlayer
{
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
	public void videoCall()
	{
		System.out.println("Smart Phone video calling");
	}
	public void click()
	{
		System.out.println("Smart phone clicking photos");
	}
	public void record()
	{
		System.out.println("Smart phone recording video");
	}
	public void play()
	{
		System.out.println("Smart phone playing music");
	}
	public void stop()
	{
		System.out.println("Smart phone stopped playing music");
	}
}

public class InterfacePhone
{
	public static void main(String args[])
	{
		SmartPhone s = new SmartPhone();
		s.call();
		s.click();
		s.play();
		
		ICamera c = new SmartPhone();
		c.click();
		c.record();
		
		IMusicPlayer m = new SmartPhone();
		m.play();
		m.stop();
	}
}