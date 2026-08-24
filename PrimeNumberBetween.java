import java.util.*;
import java.util.Scanner;

class PrimeNum
{
	public void prime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			int count = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count == 2)
			{
				System.out.println(i);
			}
			
		}
	}
}

public class PrimeNumberBetween
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		PrimeNum pf = new PrimeNum();
		
		
		System.out.println("Prime Factors are ");
		pf.prime(a);
		
	}
}