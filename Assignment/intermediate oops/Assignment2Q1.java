package assignment;




class SingletonInheritanceCheck
{
	
	static SingletonInheritanceCheck single= new SingletonInheritanceCheck();
	
	
	//No default constructor
		
	private SingletonInheritanceCheck() {
		int a=35;
		int b=75;
	System.out.println("It is : "+(a+b));
	}
	public static SingletonInheritanceCheck getinstance() //u can put any name after get<name>()
	{
		return single;
	}
}
public class Assignment2Q1 {
	public static void main(String[] args)
	{
		
		
		SingletonInheritanceCheck single=SingletonInheritanceCheck.getinstance();
		// if a new instance is created no matter what we  will get the same instance 
	
		//thats why it called singleton class.
		
	}
}