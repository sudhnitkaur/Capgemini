package Genrics;

import java.util.HashMap;


public class Random {
	public static void main(String[] args) {
		
		HashMap<Integer,Double> hashm=new HashMap<>();
	
		hashm.put(00,1.15);
		hashm.put(10,2.14);
		hashm.put(20,3.14);
		hashm.put(30,4.14);
		hashm.put(40,5.14);
		hashm.put(50,6.14);
		hashm.put(60,7.14);
		hashm.put(70,8.14);
		hashm.put(80,9.14);
		hashm.put(90,10.14);
		
	
		System.out.println(hashm);
		System.out.println("key set =   " +hashm.keySet()+"\n"+"value set =  "+hashm.values());
	 }
	 
}


