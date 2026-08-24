import java.util.Scanner;

public class ArrayMaxElement
{
	public static void main(String args[])
	{
		int arr[] = {11,2,31,43,5,16,27,81,59,130};
		System.out.println("Array is : ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println("");
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}	
		}
		System.out.println("Largest Element : "+ max);
	}
}