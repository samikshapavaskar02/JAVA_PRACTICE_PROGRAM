import java.util.*;
import java.util.Scanner;

public class SecondLargestElementIndex
{
	static int index(int arr[],int n)
	{
		int largestIndex = 0;
		int secondLargestIndex = 0;

		for(int i=1;i<n;i++)
		{
			if(arr[largestIndex] < arr[i])
			{
				secondLargestIndex = largestIndex;
				largestIndex = i;
			}
			else if(arr[i] < arr[largestIndex])
			{
				secondLargestIndex = i;
			}
		}	
		return secondLargestIndex;
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
		
		int result = index(arr,n);

        System.out.println("Index of second largest element is: " + result);
        System.out.println("Second Largest element is: " + arr[result]);
    }
}


