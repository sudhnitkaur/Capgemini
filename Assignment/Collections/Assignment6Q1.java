package Collections;

import Collections.Contact.Gender;
import java.util.Map.Entry;
import java.util.*;

class Contact
{
	
		String Name;
		long PhoneNumber;
		String Email;
		enum Gender{
			Male,Female;
		}
		Gender gender;
		
		
		
		public Contact(String Name,String Email,Gender gender)
		{
			this.Name=Name;
		
			this.Email=Email;
			this.gender=gender;
		}
		
		

		long phone(long PhoneNumber){
			this.PhoneNumber=PhoneNumber;
			return PhoneNumber;
		}
		
		
	}
public class Assignment6Q1 {
	public static void main(String[] args) {
		Gender M=Gender.Male;
		Gender F=Gender.Female;
		
		TreeMap<Long,Contact> n1=new TreeMap<>();
		
		Contact c1=new Contact("Sudhnit","sudhnit@gmail.com",F);
		Contact c2=new Contact("Sudhnitkaur","sudhnitkaur10@gmail.com",F);
		Contact c3=new Contact("Sudh","sudhnit99@gmail.com",F);
		
	
		n1.put(c1.phone(74356879),c1);
		n1.put(c2.phone(65458548),c2);
		n1.put(c3.phone(49548438),c3);
		
		
		Set<Map.Entry<Long,Contact> > en=n1.descendingMap().entrySet();
        
		
		for(Map.Entry<Long,Contact> m:en)
		{
			Long key=m.getKey();
			Contact v=m.getValue();
			 System.out.println(key+" "+v.Name+" "+v.Email+" "+v.gender);  
		}
		

		}
		
	}
	
