import java.util.*;
import java.util.Scanner;

public class CountFrequency
{
	static void frequency(int arr[],int n)
	{
		int freq = 1;
		for(int i=1;i<n;i++)
		{
			if(arr[i] == arr[i-1])
			{
				freq++;
			}
			else
			{
				System.out.println(arr[i-1]+" "+freq);
				freq = 1;
			}
		}
		System.out.println(arr[n-1]+" "+freq);
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
		
		System.out.println("Frequency of each element is :");
		frequency(arr,n);
    }
}


