import java.util.*;
import java.util.Scanner;

public class MaximumDiff
{
	static int maxDiff(int arr[],int n)
	{
		int result = arr[1] - arr[0];
		int minVal = arr[0];
		
		for(int j=1;j<n;j++)
		{
			result = Math.max(result, arr[j]-minVal);
			minVal = Math.min(minVal, arr[j]);
		}
		return result;
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
		
		int result = maxDiff(arr,n);
		System.out.println("Maximum difference is : "+result);
    }
}


