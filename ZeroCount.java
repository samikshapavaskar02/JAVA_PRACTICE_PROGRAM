import java.util.*;
import java.util.Scanner;

class TrailingZero
{
    public int count(int n)
    {
        int count = 0;

        for(int i = 5; i <= n; i = i * 5)
        {
            count = count + n / i;
        }

        return count;
    }
}

public class ZeroCount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		
		TrailingZero z = new TrailingZero();
		long result = z.count(a);
		
		System.out.println("Zeros are : "+result);
	}
}