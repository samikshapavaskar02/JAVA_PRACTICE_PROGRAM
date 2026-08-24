import java.util.*;
import java.util.Scanner;

class SumOfNumbers
{
	static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+sum(n-1);
	}
	
	public static void main(String args[])
	{
		int n =4;
		System.out.print(sum(n));
	}
}