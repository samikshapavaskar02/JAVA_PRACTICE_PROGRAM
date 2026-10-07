import java.util.*;
import java.util.Scanner;

public class BinarySearch
{
	static int search(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == x)
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
		
		System.out.println("Enter element to search : ");
		int k = sc.nextInt();
		
		int result = search(arr,k);
		System.out.println("Element found at index : "+result);
	}	
}


