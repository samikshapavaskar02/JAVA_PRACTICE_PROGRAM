import java.util.*;
import java.util.Scanner;

public class MajorityElement
{
	static int majority(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count > n/2)
			{
				return i;
			}
		}
		return -1;
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
		
		int result = majority(arr,n);
		if(result == -1)
		{
			System.out.println("No majority element found.");
		}
		else
		{
			System.out.println("Majority element: " + arr[result]);
			System.out.println("Indexes are:");
		}
		for(int i = 0; i < n; i++)
		{
			if(arr[i] == arr[result])
			{
				System.out.println(i);
			}
		}	
    }
}


