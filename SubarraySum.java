import java.util.*;
import java.util.Scanner;

public class SubarraySum
{
	static boolean Sum(int arr[],int n,int sum)
	{
		for(int i=0;i<n;i++)
		{
			int curr_sum = 0;
			for(int j=1;j<n;j++)
			{
				curr_sum = curr_sum + arr[i];
				if(sum == curr_sum)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
		
		System.out.println("Enter sum of Sub array :");
		int sum = sc.nextInt();
		
		System.out.println(Sum(arr,n,sum));
	}	
}


