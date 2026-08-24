import java.util.*;
import java.util.Scanner;

public class LeftRotationOfArray
{
	static void leftRotate(int arr[],int n)
	{
		int temp = arr[0];
		for(int i=1;i<n;i++)
		{
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
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
		
		leftRotate(arr,n);
		System.out.println("Left Rotated Array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
    }
}


