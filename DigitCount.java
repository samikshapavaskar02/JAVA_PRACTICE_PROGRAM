import java.util.*;
import java.util.Scanner;

class Count
{
	public int count(int x)
	{
		int count = 0;
		while(x>0)
		{
			x = x/10;
			count++;
		}
		return count;
	}
}

public class DigitCount
{
	public static void main(String args[])
	{
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Count c = new Count();
		int result = c.count(a);
		System.out.println("Total Digits in number : "+result);
	}
}