import java.util.*;
import java.util.Scanner;

class SumOfDigits
{
	static int sumDigit(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return sumDigit(n/10) + (n%10);
	}
	
	public static void main(String args[])
	{
		int num = 247;
		System.out.println("Sum of the digits are : "+sumDigit(num));
	}
}