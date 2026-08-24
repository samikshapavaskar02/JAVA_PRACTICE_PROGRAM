import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPractice
{
	static int search(ArrayList<Integer> list,int target)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==target)
			{
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
		{
            list.add(sc.nextInt());
        }
		
		System.out.print("Enter the target element: ");
        int target = sc.nextInt();
		
		int result = search(list,target);
		
		if(result == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Elemnent found at index: "+result);
		}		
	}
}