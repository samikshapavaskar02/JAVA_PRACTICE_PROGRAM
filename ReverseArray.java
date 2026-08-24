import java.util.*;
import java.util.Scanner;

public class ReverseArray
{
	static void reverse(int arr[],int n)
	{
		int start = 0;
		int end = n-1;
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
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
		
		System.out.println("Original Array:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
		
		reverse(arr,n);
		System.out.println("\nReverse Array is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}