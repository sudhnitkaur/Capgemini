
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
public class Test {  
public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		Expression exp = parser.parseExpression("'Heya SPEL !! How you doing?'");  
		String message = (String) exp.getValue();  
		System.out.println(message); 
		
		//Using concat() method with String
		ExpressionParser parser1 = new SpelExpressionParser();  
		Expression exp1 = parser1.parseExpression("'Welcome To My World'.concat('!')");  
		String message1 = (String) exp1.getValue();  
		System.out.println(message1); 
		
		//Converting String into byte array
		Expression exp2 = parser.parseExpression("'World'.bytes");  
		byte[] bytes = (byte[]) exp2.getValue();  
		for(int i=0;i<bytes.length;i++){  
		    System.out.print(bytes[i]+" ");  
		}  
		
		System.out.println();
		
		//Getting length after converting string into bytes
		Expression exp3 = parser.parseExpression("'Heya World'.bytes.length");  
		int length = (Integer) exp3.getValue();  
		System.out.println(length);  
		
		//Converting String contents into uppercase letter
		Expression exp4 = parser.parseExpression("new String('heya world').toUpperCase()");  
		String message2 = exp4.getValue(String.class);  
		System.out.println(message2);  
		//OR  
//		System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());  
	}  
}  



//SPEL that is spring expression language is an expression language supporting the features of querying and manipulating an object graph at runtime.
//There are many expression languages available such as JSP EL, OGNL, MVEL and JBoss EL. SpEL provides some additional features such as method invocation and string templating functionality.
