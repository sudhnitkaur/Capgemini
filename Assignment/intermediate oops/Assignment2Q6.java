package assignment;

import java.util.*;



abstract class Persistence{
	abstract public String persist();
}

class FilePersistence extends Persistence{
	
	public String persist()  {
    	String a="File";
		return a;
}
}

class DatabasePersistence extends Persistence{
	
	public String persist() 
	 {
    	String b="Database";
    			return b;
    }
		
}
class client{
	Persistence ps1=new FilePersistence();
	String f=ps1.persist();
	Persistence ps2=new DatabasePersistence();
	String g=ps2.persist();
}

public class Assignment2Q6{
	
	public static void main(String [] args) {
		
			
		
		Persistence p = new FilePersistence();
		p.persist();
	}
}