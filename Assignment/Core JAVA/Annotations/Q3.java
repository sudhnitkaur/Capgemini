package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) 
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	
	int Sequence(); 
	
}


class sequence{
	@Execute(Sequence=2)
	void myMethod1() {
		myMethod2();
		
	}
	
	@Execute(Sequence=1)
	void myMethod2() {
		myMethod3();
		
	}
	
	
	
	@Execute(Sequence=3)
	void myMethod3() {
		System.out.println(" Working ");
	}
	
	
}

public class Q3 {
	
	public static void main(String[] args) {
		sequence s=new sequence();
		s.myMethod1();
	}
	


}
