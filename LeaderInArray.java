import java.util.*;
import java.util.Scanner;

public class LeaderInArray
{
	static void leader(int arr[],int n)
	{
		int current_leader = arr[n-1];
		System.out.println(current_leader);
		for(int i=n-2;i>=0;i--)
		{
			if(current_leader < arr[i])
			{
				current_leader = arr[i];
				System.out.println(current_leader);
			}
		}
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
		
		System.out.println("Leaders are : ");
		leader(arr,n);
    }
}


