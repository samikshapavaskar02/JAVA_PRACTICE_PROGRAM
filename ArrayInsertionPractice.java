import java.util.*;
import java.util.Scanner;

public class ArrayInsertionPractice
{
	static int insert(int arr[],int n,int cap,int x,int pos)
	{
		if(n==cap)
		{
			return n;
		}
		
		int index = pos-1;
		
		for(int i=n-1;i>=index;i--)
		{
			arr[i+1] = arr[i];
		}
		arr[index] = x;
		
		return n+1;
	}
	
	public static void main(String args[])
	{
		int arr[] = new int[10];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
		
		int n = 4;  
		for(int i=0;i<arr.length;i++)
		{
			if(i<n)
			{
				System.out.print(arr[i] +" ");
			}
			else
			{
				System.out.print("_ ");
			}
		}
		
		System.out.println(" ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element to insert :");
        int x = sc.nextInt(); 		
		System.out.println("Enter position :");
        int pos = sc.nextInt();  

        n = insert(arr, n, arr.length, x, pos);

        System.out.println("Updated Array:");

        for(int i = 0; i < arr.length; i++)
        {
            if(i<n)
			{
				System.out.print(arr[i] + " ");
			}
			else
			{
				System.out.print("_ ");
			}
        }
	}
}