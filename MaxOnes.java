import java.util.*;
import java.util.Scanner;

public class MaxOnes
{
	static int max(int arr[],int n)
	{
		int count = 0;
		int maxCount = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 1)
			{
				count++;
				maxCount = Math.max(maxCount, count);
			}
			else
			{
				count = 0;
			}
		}
		return maxCount;
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
		
		int result = max(arr,n);
		System.out.println("Maximum Consecutive 1's are : "+result);
    }
}


