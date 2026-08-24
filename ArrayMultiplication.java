import java.util.*;
import java.util.Scanner;

public class ArrayMultiplication 
{
	public static void main(String args[])
	{
		int A[][]={{3,5,9},{7,6,2},{4,3,5}};
		int B[][]={{1,0,0},{0,1,0},{0,0,1}};
		
		int C[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					C[i][j] = C[i][j]+A[i][k]*B[k][j];
				}
			}
		}
		
		for(int i=0;i<C.length;i++)
		{
			for(int j=0;j<C[0].length;j++)
			{
				System.out.print(C[i][j] +" ");
			}
			System.out.println("");
		}
	}
}
