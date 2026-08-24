import java.util.*;
import java.util.Scanner;

class PalindromeOrNot
{
	public boolean PalindromeNum(int n)
	{
		int rev = 0;
		int temp = n;
		while(temp>0)
		{
			rev = rev*10 + n%10;
			temp = temp/10;
		}
		return temp == rev;
	}
}

public class PalindromeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int a = sc.nextInt();
		
		PalindromeOrNot p = new PalindromeOrNot();
		boolean result = p.PalindromeNum(a);
		System.out.println("Number is Palindrome or Not : "+result);
		
	}
}