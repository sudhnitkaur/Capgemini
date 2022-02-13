package assignment;

import java.util.Scanner;

public class ExceptionAQ1 

{  
	public static void main(String arg[])
    {  
		try
		{
			int x,y,z;
			Scanner KB=new Scanner(System.in);
			
			System.out.println("Enter first number : ");
			x=KB.nextInt();
       
			System.out.println("Enter second number : ");
			y=KB.nextInt();
                                                z=x/y;
			System.out.println("Result:"+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
	
	}
}
