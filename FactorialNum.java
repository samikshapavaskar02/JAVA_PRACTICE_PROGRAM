import java.util.*;
import java.util.Scanner;

class Factorial
{
	public long fact(int n)
	{
		long factorial = 1;
		for(int i=1;i<=n;i++)
		{
			factorial = factorial * i;
		}
		return factorial;
	}
}

public class FactorialNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Factorial f = new Factorial();
		long result = f.fact(a);
		
		System.out.println("Factorail of "+a+" is :"+result);
	}
}