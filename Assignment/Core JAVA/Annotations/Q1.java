package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface test{
  int testCaseNo();
}
public class Q1 {
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@interface Test{
		
	}
		@Test
		void test_case() {
			System.out.println("Working");
		}
		public static void main(String[] args) {
			Q1 A7=new Q1();
			
			
			A7.test_case();
		}
		
		
	 
}
