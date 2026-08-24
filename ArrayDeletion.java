import java.util.Scanner;

public class ArrayDeletion
{
	public static void main(String args[])
	{
		int arr[] = new int[10];
		arr[0] = 5;
		arr[1] = 9;
		arr[2] = 6;
		arr[3] = 10;
		arr[4] = 12;
		arr[5] = 7;
		
		int n = 6;
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println("");
		
		int index = 2;
		
		for(int i=index;i<n-1;i++)
		{
			arr[i] = arr[i+1];
		}
		
		n = n-1;
		
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println("");
	}
}
