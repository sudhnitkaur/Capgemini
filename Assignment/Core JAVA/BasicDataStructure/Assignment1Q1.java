package assignment;

import java.util.*;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num)
    {
        int temp = num;
        int count = 0;
        while(temp!=0)
        {
            count++;
            temp = temp/10;
        }
        int sum = 0;
        int a = num;
        while(a!=0)
        {
          int var = a%10;
          sum = sum + (int)Math.pow(var,count);
          a = a/10;
        }
        if(sum == num)
       
        {
          return true;
          
        }
        else
        {
            return false;
        }
    }
  }

  public class Assignment1Q1
  {
    public static void main(String[] args)
    {
      ArmstrongOrNot ob = new ArmstrongOrNot();
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      boolean b = ob.armstrongCheck(n);
     
      System.out.println("Is " + n + " a Palindrome number?  " );
      System.out.println(b);
     
    }
  }