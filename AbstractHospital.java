abstract class Hospital
{
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}

class MyHospital extends Hospital
{
	public MyHospital()
	{
		System.out.println("MyHospital");
	}
	
	@Override
    void emergency() 
	{
        System.out.println("Emergency services ready.");
    }

    @Override
    void appointment() 
	{
        System.out.println("Appointment booked.");
    }

    @Override
    void admit() 
	{
        System.out.println("Patient admitted to ward.");
    }

    @Override
    void billing() 
	{
        System.out.println("Billing process generated.");
    }
}

public class AbstractHospital
{
	public static void main(String args[])
	{
		Hospital h = new MyHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
	}
}