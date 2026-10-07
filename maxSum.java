import java.util.*;
import java.util.Scanner;

class WindowSlidingTechnique
{
	static int maxSum(int arr[],int n,int k)
	{
		int curr_sum = 0;
		for(int i=0;i<k;i++)
		{
			curr_sum = curr_sum + arr[i];
		}
		
		int max_sum = curr_sum;
		
		for(int i=k;i<n;i++)
		{
			curr_sum = curr_sum + arr[i] - arr[i-k];
			if(curr_sum > max_sum)
			{
				max_sum = curr_sum;
			}
		}
		
		return max_sum;
		
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
		
		System.out.println("Enter value of k : ");
		int k = sc.nextInt();
		
		int result = maxSum(arr,n,k);
		System.out.println("Maximum Sum of "+k+" elements :"+result);
	}	
}


