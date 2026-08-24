import java.util.*;
import java.util.Scanner;

class CountTarget
{
	public int countnum(int[] nums,int target)
	{
		int count = 0;
		for(int i =0;i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				count++;
			}
		}
		return count;
	}
}

public class CountTargetElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		System.out.println("Enter array element :");
		for(int i=0;i<n;i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter target value :");
		int target = sc.nextInt();
		
		CountTarget c = new CountTarget();
		int result = c.countnum(nums,target);
		
		System.out.println("Target "+target+" appear "+result+" times");
	}
}