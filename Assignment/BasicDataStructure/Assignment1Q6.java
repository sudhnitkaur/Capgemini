package assignment;

import java.util.*;
class Login{
	
    String userId = "Ajay",password = "password";
  
    public String loginUser(String user, String pass)
    {
    		if(userId.equals(user) && password.equals(password))
    		{
    			return "welcome";
    		}
    		else
    		{
    			 
    			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    		}
    return "NOP";
    }

}
public class Assignment1Q6 
{
    public static void main(String args[]) 
    {
    	String a,b;
   	 int k=0;
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the Username and Password:");
    	while(true)
    	{
    		++k;
    	a=scanner.nextLine();
    	b=scanner.nextLine();
    	Login ib=new Login();
    	String s=ib.loginUser(a, b);
    	if(s.equals("welcome"))
    	{
    	System.out.println(s);
    	break;
    	}
    	if(k==3)
    	{
    		System.out.println("You have entered wrong credentials 3 times "
    				+ "contact Admin ");
    		break;
    	}
    	}
    	

    }
}