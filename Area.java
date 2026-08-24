import java.util.*;
import java.lang.*;

public class Area
{
	public static void main(String args[])
	{
		float height,base;
		System.out.println("Enter base and height: ");
		
		Scanner s = new Scanner(System.in);
		base = s.nextFloat();
		height = s.nextFloat();
		
		float area = (base * height)/2;
		System.out.println("Area : "+area);
		
	}
}