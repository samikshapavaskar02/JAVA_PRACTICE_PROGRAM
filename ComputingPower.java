import java.util.*;
import java.util.Scanner;

class Power
{
	public int computingP(int x, int n)
	{
		int val = 1;
		for(int i = 0;i<n;i++)
		{
			val = val*x;
		}
		return val;
	}
}

public class ComputingPower
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a power: ");
		int b = sc.nextInt();
		
		Power p = new Power();
		int result = p.computingP(a,b);
		
		System.out.println(a+" ^ "+b+" = "+result);
	}
}