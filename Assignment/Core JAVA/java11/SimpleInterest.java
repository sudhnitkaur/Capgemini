


package java11;

import java.util.Scanner;

interface calculate{
    public void give(int p,int r,int t);

}
public class SimpleInterest {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Principal Amount, Rate of Interest and Time: ");
        int p=scanner.nextInt();
        int r=scanner.nextInt();
        int t= scanner.nextInt();
        System.out.println("The Principal Amount: ₹"+ p);
        System.out.println("The Rate of Interest: "+ r);
        System.out.println("The Time: "+ t);
        calculate simpleinterest = (a,b,c) -> System.out.println("The simple interest: ₹"+ (a*b*c)*0.01);
        simpleinterest.give(p,r,t);
    }
}



