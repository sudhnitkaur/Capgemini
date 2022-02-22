package assignment;


abstract class Assignment2Q4
{
	abstract void Example();
}

class child extends Assignment2Q4
{
	void Example()
	{
		System.out.println("Hello World ");
	}
	abstract class ABSTRACT
	{
		void display()
		{
		System.out.println("display");
		}
		
	}

}
class Abstract1 {

	public static void main(String[] args) {
		
		Assignment2Q4 a2q4=new child();
		a2q4.Example();
		
	
	}
}
