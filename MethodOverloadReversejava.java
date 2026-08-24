public class MethodOverloadReverse
{
	static int reverse(int n)
	{
		int rev = 0;
		int r;
		
		while(n>0)
		{
			r = n%10;
			rev = rev * 10 +r;
			n = n/10;
		}
		return rev;
	}
	
	static void reverse(int A[])
	{
		for(int i = A.length - 1; i >= 0; i--)
        {
            System.out.print(A[i] + " ");
        }
	}	
	
	public static void main(String args[])
	{
		int num = 12345;
        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Reversed Number: " + reverse(num));

        System.out.println("Reverse array is: ");
		reverse(A);
	}
}