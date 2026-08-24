import java.util.*;
import java.util.Scanner;

public class BitwiseOperators
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Bitwise AND :" +(a&b));
		System.out.println("Bitwise OR :" +(a|b));
		System.out.println("Bitwise XOR :" +(a^b));
		System.out.println("Bitwise LEFT SHIFT :" +(a<<1));
		System.out.println("Bitwise RIGHT SHIFT :" +(a>>1));
	}
}