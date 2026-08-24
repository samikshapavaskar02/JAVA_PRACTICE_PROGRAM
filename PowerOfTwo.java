import java.util.*;
import java.util.Scanner;

class PowerTwo
{
	public boolean twoPower(int n)
	{
		if(n==0)
		{
			return false;
		}
		
		while(n > 1)
		{
			if(n%2 != 0)
			{
				return false;
			}
			n= n/2;
		}
		return true;
	}
}

public class PowerOfTwo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		PowerTwo p = new PowerTwo();
		boolean result = p.twoPower(a);
		
		System.out.println(result);
	}
}