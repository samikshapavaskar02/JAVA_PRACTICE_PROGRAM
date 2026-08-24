import java.util.*;
import java.util.Scanner;

public class MovesZeroToEnd
{
	static void zeroAtEnd(int arr[],int n)
	{
		int i = 0;
		
		for(int j=0;j<n;j++)
		{
			if(arr[j] != 0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}
	
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enterelements of array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
		
		zeroAtEnd(arr,n);
		System.out.println("Array after moving zero to end :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
    }
}


