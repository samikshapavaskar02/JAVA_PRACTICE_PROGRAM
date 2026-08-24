import java.util.*;
import java.util.Scanner;

class Divisor
{
	public void allDivisor(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i +" ");
			}
		}
	}
}

public class DivisorNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		Divisor d = new Divisor();
		
		System.out.println("Divisors are ");
		d.allDivisor(a);
	}
}