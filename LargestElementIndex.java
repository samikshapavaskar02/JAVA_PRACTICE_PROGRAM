import java.util.*;
import java.util.Scanner;

public class LargestElementIndex
{
	static int index(int arr[],int n)
	{
		int largestIndex = 0;

		for(int i=0;i<n;i++)
		{
			if(arr[largestIndex] < arr[i])
			{
				largestIndex = i;
			}
		}
		return largestIndex;
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

        System.out.println("Index of largest element is: " + result);
        System.out.println("Largest element is: " + arr[result]);
    }
}

