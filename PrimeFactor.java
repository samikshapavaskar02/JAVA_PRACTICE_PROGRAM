import java.util.*;
import java.util.Scanner;

// 60 = 2*2*3*5

class PrimeFact
{
	public void factors(int n)
	{
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i +" ");
				n = n/i;
			}
		}
	}
}

public class PrimeFactor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		PrimeFact pf = new PrimeFact();
		
		
		System.out.println("Prime Factors are ");
		pf.factors(a);
	}
}