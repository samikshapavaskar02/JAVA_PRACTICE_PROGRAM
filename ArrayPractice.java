public class ArrayPractice
{
	public static void main(String args[])
	{
		//Dexlaring array 
		int A[] = new int[10];
		
		int B[] = {1,2,3,4,5};
		
		int C[];
		C = new int[5];
		
		int[] D = new int[15];
		
		//Assigning Array
		B[2] = 15;
		
		//Accessing Array 
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		
		System.out.println("");
		
		for(int x : B)
		{
			System.out .println(x);
			
		}
		
		System.out.println("");
		
		//Changing Array Element Value
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]++);
		}
		
		System.out.println("");
		
		for(int x : B)
		{
			System.out.println(x);
		}
	}
}