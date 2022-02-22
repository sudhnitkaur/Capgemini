package Lambda;

import java.util.Scanner;


public class Assignment4Q1 {
	
	
	
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter two numbers for Operations: ");
        double a= s.nextDouble();
        double b= s.nextDouble();
        System.out.println("Your Choices 1)Add 2)Subtract 3)Multiply 4)Divide: ");
        int choice= s.nextInt();
        switch (choice){
            case 1:
                Calculator add = (x,y) -> System.out.println(x+y);
                add.num(a,b);
                break;
            case 2:
                Calculator sub= (x,y) -> System.out.println(x-y);
                sub.num(a,b);
                break;
            case 3:
                Calculator mul=(x,y) -> System.out.println(x*y);
                mul.num(a,b);
                break;
            case 4:
                Calculator div=(x,y) -> System.out.println(x/y);
                div.num(a,b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Your Choices 1)Add 2)Subtract 3)Multiply 4)Divide: ");
        int choice1= s.nextInt();
        switch (choice1){
            case 1:
                Calculator add = (x,y) -> System.out.println(x+y);
                add.num(a,b);
                break;
            case 2:
                Calculator sub= (x,y) -> System.out.println(x-y);
                sub.num(a,b);
                break;
            case 3:
                Calculator mul=(x,y) -> System.out.println(x*y);
                mul.num(a,b);
                break;
            case 4:
                Calculator div=(x,y) -> System.out.println(x/y);
                div.num(a,b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Your Choices 1)Add 2)Subtract 3)Multiply 4)Divide: ");
        int choice2= s.nextInt();
        switch (choice2){
            case 1:
                Calculator add = (x,y) -> System.out.println(x+y);
                add.num(a,b);
                break;
            case 2:
                Calculator sub= (x,y) -> System.out.println(x-y);
                sub.num(a,b);
                break;
            case 3:
                Calculator mul=(x,y) -> System.out.println(x*y);
                mul.num(a,b);
                break;
            case 4:
                Calculator div=(x,y) -> System.out.println(x/y);
                div.num(a,b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Your Choices 1)Add 2)Subtract 3)Multiply 4)Divide: ");
        int choice3= s.nextInt();
        switch (choice3){
            case 1:
                Calculator add = (x,y) -> System.out.println(x+y);
                add.num(a,b);
                break;
            case 2:
                Calculator sub= (x,y) -> System.out.println(x-y);
                sub.num(a,b);
                break;
            case 3:
                Calculator mul=(x,y) -> System.out.println(x*y);
                mul.num(a,b);
                break;
            case 4:
                Calculator div=(x,y) -> System.out.println(x/y);
                div.num(a,b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Your Choices 1)Add 2)Subtract 3)Multiply 4)Divide: ");
        int choice4= s.nextInt();
        switch (choice4){
            case 1:
                Calculator add = (x,y) -> System.out.println(x+y);
                add.num(a,b);
                break;
            case 2:
                Calculator sub= (x,y) -> System.out.println(x-y);
                sub.num(a,b);
                break;
            case 3:
                Calculator mul=(x,y) -> System.out.println(x*y);
                mul.num(a,b);
                break;
            case 4:
                Calculator div=(x,y) -> System.out.println(x/y);
                div.num(a,b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}
interface Calculator{
    void num(double a, double b);
}