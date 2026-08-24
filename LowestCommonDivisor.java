import java.util.*;
import java.util.Scanner;

class Lcm
{
	public int lcmOfNum(int a,int b)
	{
		int max;
		if(a > b)
		{
			max = a;
		}
		else
		{
			max = b;
		}
		
		while(true)
		{
			if(max%a==0 && max%b==0)
			{
				return max;
			}
			max++;
		}
	}
}

public class LowestCommonDivisor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		
		Lcm x = new Lcm();
		int result = x.lcmOfNum(a,b);
		
		System.out.println("LCM of "+a+" and "+b+" is:"+result);
	}
}