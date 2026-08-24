import java.util.Scanner;

public class ArraySearch
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array is : ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println("");
		
		int key;
		System.out.println("Enter a key : ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		
		for(int i=0;i<=arr.length;i++)
		{
			if(key == arr[i])
			{
				System.out.println("Key Found at "+i+" position");
				System.exit(0);
			}
		}
		System.out.println("not found");
	}
}