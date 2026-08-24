import java.util.*;
import java.util.Scanner;

public class LeftRotationOfArrayNew
{
	static void leftRotate(int arr[],int n,int d)
	{
		int temp[] = new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i] = arr[i];
		}
		
		for(int i=d;i<n;i++)
		{
			arr[i-d] = arr[i];
		}
		
		for(int i=0;i<d;i++)
		{
			arr[n-d+i] = temp[i];
		}
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
		
		System.out.println("Enter the number of elements to left rotate : ");
		int d = sc.nextInt();
		
		leftRotate(arr,n,d);
		System.out.println("Left Rotated Array is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
    }
}


