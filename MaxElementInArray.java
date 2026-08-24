public class MaxElementInArray
{
	static int maximum(int A[])
	{
		int max =A[0];
		 for(int i=1;i<A.length;i++)
		 {
			if(max < A[i])
			{
				max = A[i];
			}
		 }
		 return max;
	}
	
	public static void main(String args[])
	{
		int A[] ={2,11,5,32,43,24};
		
		int result = maximum(A);
		System.out.println(result);
	}
}