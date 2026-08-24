import java.util.*;
import java.util.Scanner;

public class MaxElement
{
	public static void main(String args[])
	{
		int arr[] = {5,9,6,10,12,7,3,5,4,2};
		System.out.println("Array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}	
		System.out.println("");
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Largest element is : "+max);
	}
}
