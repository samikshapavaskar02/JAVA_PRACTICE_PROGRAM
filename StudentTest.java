class Subject
{
	private String subID;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	public Subject(String subID,String name,int maxMarks)
	{
		this.subID = subID;
		this.name = name;
		this.maxMarks = maxMarks;
	}
	
	public String getSubId()
	{
		return subID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMaxMarks()
	{
		return maxMarks;
	}
	
	public int getMarksObtain()
	{
		return marksObtain;
	}
	
	public void setMaxMarks(int mm)
	{
		maxMarks = mm;
	}
	
	public void setObtainMarks(int mo)
	{
		marksObtain = mo;
	}
	
	public boolean isQualified()
	{
		return marksObtain >= maxMarks*40/100;
	}
	
	public String toString()
	{
			return "\nSubject ID:"+subID+"\nname :"+name+"\nMarks Obtained :"+marksObtain;
	}
}

public class StudentTest
{
	public static void main(String args[])
	{
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("s001","DL",100);
		subs[1] = new Subject("s002","ML",100);
		subs[2] = new Subject("s003","NLP",100);
		
		for(Subject s:subs)
		{
			System.out.println(s);
		}
	}
}