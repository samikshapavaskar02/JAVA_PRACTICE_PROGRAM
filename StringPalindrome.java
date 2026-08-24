import java.util.*;
import java.util.Scanner;

class StringPalindrome
{
	static boolean isPalindrome(String str,int start,int end)
	{
		 if(start>=end)
		 {
			return true;
		}
		return(str.charAt(start)==str.charAt(end) && isPalindrome(str,start+1,end-1));
	}
	
	public static void main(String args[])
	{
		String str = "madam";
		int start = 0;
		int end = str.length() -1;
		
		if(isPalindrome(str,start,end))
		{
			System.out.println("String is Palindrome");
		}
		else
        {
            System.out.println("String is Not Palindrome");
        }
	}
}