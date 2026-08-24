import java.util.Scanner;

public class ArrayLeftRotation
{
	public static void main(String args[])
	{
		int arr[] = {5,9,6,10,12,7,3,5,4,2};
		System.out.print("Array is : ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println("");
		
		int temp = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1] = arr[i];	
		}
		arr[arr.length-1] = temp;
		System.out.print("Array after left rotation : ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
	}
}
