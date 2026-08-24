class Student
{
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total()
	{
		return m1+m2+m3;
	}
	
	public double average()
	{
		return (double)total()/3;
	}
	
	public char grade()
	{
		if(average( )>= 60) 
		{
			return 'A';
		}
		else
		{
			return 'B';
		}
	}	
	
	public String details()
	{
		return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
}

public class StudentDemo
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.roll = 1;
		s.name = "Sam";
		s.course = "CS";
		s.m1 = 70;
		s.m2 = 80;
		s.m3 = 65;
		
		System.out.println("Total : "+s.total());
		System.out.println("Average : "+s.average());
		System.out.println("Grade : "+s.grade());
		System.out.println("Details : "+s.details());
	}
}