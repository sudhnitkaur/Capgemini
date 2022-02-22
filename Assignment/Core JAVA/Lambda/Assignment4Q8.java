package Lambda;

import java.util.ArrayList;

public class Assignment4Q8 {

	 public static void main(String[] args) {
	        thread execute = new thread();
	        System.out.println(Thread.currentThread());
	        execute.start();
	    }
	}
	class thread extends Thread{
	    public void run(){
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(11);
	        numbers.add(12);
	        numbers.add(19);
	        numbers.add(14);
	        numbers.add(23);
	        numbers.add(39);
	        numbers.add(05);
	        //This will print the array list using a consumer function
	        numbers.forEach(t -> System.out.println(t));
	    }
	    interface Consumer{
	        void numbers(double a);
}
}