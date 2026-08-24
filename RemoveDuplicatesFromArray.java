import java.util.*;
import java.util.Scanner;

public class RemoveDuplicatesFromArray
{
	static int duplicate(int nums[],int n)
	{
		int i = 0;
		for(int j=1;j<n;j++)
		{
			if(nums[i] != nums[j])
			{
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}
	
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter sorted elements of array:");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
		
		int result = duplicate(arr,n);
		System.out.println("New Array size is : "+result);
		System.out.println("Enter sorted elements of array:");
        for(int i=0; i<result; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}


