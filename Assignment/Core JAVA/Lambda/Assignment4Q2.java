package Lambda;
import java.util.Scanner;
import java.util.function.Predicate;

public class Assignment4Q2 {

	
	 public static void main(String[] args) {
	        Scanner scanner= new Scanner(System.in);
	        System.out.println("Enter price of the order: ");
	        int price=scanner.nextInt();
	       
	        acceptance determine =(c) -> {  


	        	if(c>10000 ){
	                System.out.println("Your order of amount "+price+" is ACCEPTED and COMPLETED");
	            }
	            else if(c<10000){
	                System.out.println("The amount of order is not processable");
	            }
	            else{
	                System.out.println("Your order's status is ambiguous right now");
	            }
	        };

	        determine.decision(price);


	    }    
	}
	interface acceptance{
	
		 void decision(int a);
	}

