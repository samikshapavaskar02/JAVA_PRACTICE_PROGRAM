import java.util.*;
import java.util.Scanner;

class Gcd
{
	public int hcf(int m, int n)
	{
		while(m!=n)
		{
			if(m>n)
			{
				m = m-n;
			}
			else
			{
				n = n-m;
			}
		}
		return m;
	}
}

public class GreatestCommonDivisor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		
		Gcd x = new Gcd();
		int result = x.hcf(a,b);
		
		System.out.println("HCF of "+a+" and "+b+" is:"+result);
	}
}