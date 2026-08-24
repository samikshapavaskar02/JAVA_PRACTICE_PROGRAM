import java.util.*;
public class Arithmetic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1 : ADD");
		System.out.println("2 : SUB");
		System.out.println("3 : MUL");
		System.out.println("4 : DIV");
		System.out.println("5 : EXIT");
		
		System.out.println("Enter 2 Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter option number : ");
		int option = sc.nextInt();
		
		switch(option)
		{
			case 1 :int sum = a+b;
					System.out.println("Addition is : "+sum);
					break;
					
			case 2 :int sub = a-b;
					System.out.println("Subtraction is : "+sub);
					break;
					
			case 3 :int mul = a*b;
					System.out.println("Multiplication is : "+mul);
					break;
					
			case 4 :if (b == 0) {
                        System.out.println("Division by zero not allowed");
                    } else {
                        System.out.println("Division is : " + (a / b));
                    }
					break;
					
			case 5:System.out.println("Exiting program...");
                    break;		
					
			default :System.out.println("Invalid Option");	
		}
		
	}
}