import java.util.Scanner;

public class ArraySecMaxElement
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
		
		int max1,max2;
		max1 = max2 = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2)
			{
				max2 = arr[i];
			}			
		}
		System.out.println("Second Largest Element : "+ max2);
	}
}