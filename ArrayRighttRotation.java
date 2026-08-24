public class ArrayRightRotation
{
	public static void main(String args[])
	{
		int arr[] = {5,9,6,10,12,7,3,5,4,2};
		System.out.print("Array is : ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println("");
		
		int temp = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1] = arr[i];	
		}
		arr[0] = temp;
		System.out.print("Array after left rotation : ");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
	}
}
