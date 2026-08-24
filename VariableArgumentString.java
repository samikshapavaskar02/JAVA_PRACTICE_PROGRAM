public class VariableArgumentString
{
	static void show(String... S)
	{
		for(int i=0;i<S.length;i++)
		{
			System.out.println(i+1+". "+S[i]);
		}
	}
	
	public static void main(String args[])
	{
		show("Akshata","Rohit","Diksha","Samiksha","Pradnyesh");
	}
}