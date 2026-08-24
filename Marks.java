import java.util.*;

public class Marks
{
	public static void main(String args[])
	{
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 3 subject : ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		
		int total = m1+m2+m3;
		int avg = total/3;
		
		if(avg >= 70)
		{
			System.out.println("Grade is A");
		}
		else if(avg >= 60 && avg <70)
		{
			System.out.println("Grade is B");
		}	
		else if(avg >= 50 && avg <60)
		{
			System.out.println("Grade is C");
		}
		else if(avg >= 50 && avg <60)
		{
			System.out.println("Grade is D");
		}
		else 
		{
			System.out.println("Grade is Fail");
		}
	}
}