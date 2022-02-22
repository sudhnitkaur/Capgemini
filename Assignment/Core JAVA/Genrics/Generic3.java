package Genrics;


import java.util.*;
public class Generic3 {
	public static <T> void swap(T[] a, int i,int j) {
		T temp=a[i]; 
	    a[i]=a[j];   
        a[j]=temp;   
        
	}  
	public static void main(String[] args) {
		
		
		Integer a[]= {0,1};
		System.out.println("ORiginal : "+Arrays.toString(a));
		
		swap(a,0,1);
		System.out.println("Output : "+Arrays.toString(a));
		
				}
		
	}
