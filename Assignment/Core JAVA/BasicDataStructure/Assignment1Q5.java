package assignment;

import java.util.*;
class TaxAmount{
    public double calculateTaxAmount(double ctc)
    {
    	if(ctc>0 && ctc <=180000)
    	{
    		return 0;
    	}
    	else if(ctc>181001 && ctc <=300000)
    	{
    		return ctc*0.1;
    	}
    	else if(ctc>300001 && ctc <=500000)
    	{
    		return ctc*20/100;
    	}
    	else
    	{
    		double amount=ctc*30/100;
    		return amount;
    	}
    }
}
public class Assignment1Q5 {
 public static void main(String args[])
 {
	 TaxAmount ta=new TaxAmount();
	 Scanner scanner=new Scanner(System.in);
	 double c=scanner.nextDouble();
	 double amount=ta.calculateTaxAmount(c);
	 //double d=90;
	 System.out.println("TaxAmount = "+amount);
 }
}