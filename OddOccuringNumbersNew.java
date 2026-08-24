import java.util.*;
import java.util.Scanner;

class OddOccurNew
{
	public void oddNew(int arr[])
	{
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			int count = 0;
			for(int j=0;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count%2 != 0)
				{
					System.out.println("arr[i]");
				}
		}
	}
}

public class OddOccuringNumbersNew
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array :");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		System.out.println("Array elements are : ");
		for(int i =0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		
		OddOccur o = new OddOccur();
		int result = o.odd(nums);
		
		System.out.println("Odd Ocucuring of number is :"+result);
		
	}
}
