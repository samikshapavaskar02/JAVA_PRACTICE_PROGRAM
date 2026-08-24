import java.util.*;
import java.util.Scanner;

class Divisor
{
	public void allDivisor(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i +" ");
			}
		}
	}
}

public class AllDivisor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		Divisor d = new Divisor();
		
		
		System.out.println("Prime Factors are ");
		d.allDivisor(a);
	}
}