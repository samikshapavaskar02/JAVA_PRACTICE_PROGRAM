class Student
{
	int roll;
	boolean IsPass;
	void disp()
	{
		System.out.println("Roll No : "+roll);
		System.out.println("Pass or Fail : "+IsPass);
	}
}

class Test
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.roll = 5;
		s.IsPass = true;
		s.disp();
	}
}