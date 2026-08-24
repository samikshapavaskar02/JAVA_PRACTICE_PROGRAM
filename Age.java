import java.util.*;

public class Age
{
	public static void main(String args[])
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age of person : ");
		age = sc.nextInt();
		
		if(age >=14 && age <= 55)
		{
			System.out.println("Young");
		}
		else 
		{
			System.out.println("Not Young");
		}	
	}
}