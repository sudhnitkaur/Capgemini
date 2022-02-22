package assignment;

import java.util.*;
class Students
{
	private int subjectA,subjectB,subjectC;
	int p,q,r;
	Students(int a,int b,int c)
	{
		this.subjectA=a;
		this.subjectB=b;
		this.subjectC=c;
	}
	
	public int  studentsTotalMarksInAllSubjects(Student[] students)
	{
		for(int i=0;i<3;i++)
		{
			p=0;
			p=s[i].a+s[i].b+s[i].c;
			q=q+p;
		}

		
		return q;
	}
	
	public double studentsAverageMarksInAllSubjects(Student[] students) {
		{
			for(int i=0;i<3;i++)
			{
				
				q=(s[i].a+s[i].b+s[i].c)/900;
				
			}
		
		}
		
	}
    public int[] subjectWiseMarks(Student[] students,String subjectName)
    public int subjectATotalByStudents(int[] marks) {}
    public int subjectBTotalByStudents(int[] marks) {}
    public int subjectCTotalByStudents(int[] marks) {}
	
	
	
	
	
}
public class Assignment1Q9 {

	public static void main(String[] args) {
			
		Students ob[]=new Students[3];
	//	Students s=new Students();
		int a=0,b=0,c=0;
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			ob[i]=new Students(a,b,c);
			ob[i]=new Students(a,b,c);
		}
		int m=ob[1].studentsTotalMarksInAllSubjects(ob);
		System.out.println(m);
		int n=ob[1].studentsAverageMarksInAllSubjects(ob);
		System.out.println(n);
	
	}

}