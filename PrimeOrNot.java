import java.util.*;
import java.util.Scanner;

class PrimeNum
{
	public boolean prime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

public class PrimeOrNot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		PrimeNum p = new PrimeNum();
		boolean result = p.prime(a);
		
		System.out.println("Prime or not :"+result);
	}
}