package assignment;
import java.util.*;

class ArmstrongNumBetweenRange
{
    public void armstrongNumbersInRange(int min,int max)
    {
        int temp;
        temp = min;
        int sum = 0;
        while(temp!=0)
        {
          int a = temp%10;
          sum = sum+(int)Math.pow(a,3);
          temp = temp/10;
        }
        if(sum == min)
          System.out.print(" "+sum);
      }
    }

  public class Assignment1Q2 {
    public static void main (String [] args)
    {
      ArmstrongNumBetweenRange am = new ArmstrongNumBetweenRange();
      int min = 100;int max = 999;
      for(int i=min;i<=max;i++)
      {
        am.armstrongNumbersInRange(i,max);
      }
    }
  }