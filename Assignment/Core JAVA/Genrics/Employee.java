package Genrics;
import java.util.*;

class Detail{
	 private int id;
	 private String name;
	 private int salary;
	 private String department;
		
		
		public Detail(int id,String name,int salary,String department)  {
			
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.department=department;
		}
		
		public String  DisplayDetails(){
			return "ID:"+id+"\n"+"Name"+name+"\n"+"Salary:"+salary+"\n"+"Department"+department+"\n";
			
		}
		
	}

public class Employee {
	public static void main(String[] args) {
		Detail a=new Detail(11813118,": lux",400000,": ECE");
		Detail b=new Detail(11912118,": mux",400000,": ECE");
		
		
	    HashSet<Detail> hs=new HashSet<>();
		hs.add(a);
		hs.add(b);
		
		for(Detail i:hs) {
		System.out.println(i.DisplayDetails());
		
		}
	}
	
	


}
