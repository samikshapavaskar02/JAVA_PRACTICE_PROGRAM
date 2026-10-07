import java.util.*;
import java.util.Scanner;

class WindowSliding
{
	static int maxMul(int arr[],int n,int k)
	{
		int curr_mul = 1;
		for(int i=0;i<k;i++)
		{
			curr_mul = curr_mul * arr[i];
		}
		
		int max_mul = curr_mul;
		
		for(int i=k;i<n;i++)
		{
			//new product = (old product / removed element) * new element
			curr_mul = (curr_mul / arr[i-k]) * arr[i];
			if(curr_mul > max_mul)
			{
				max_mul = curr_mul;
			}
		}
		
		return max_mul;
		
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
		
		int result = maxMul(arr,n,k);
		System.out.println("Maximum Product of "+k+" elements :"+result);
	}	
}


