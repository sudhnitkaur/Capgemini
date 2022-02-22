package Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment4Q6 {

	 public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        
	        list.add("Hate");
	        list.add("is");
	        list.add("the");
	        list.add("enemy");
	        list.add("of");
	        list.add("every");
	        list.add("human");
	        Predicate<String> length =(c) -> {
	            if(c.length()%2==0){
	                return true;
	            }
	            else return false;
	        };
	       
	        list.stream().filter(length).collect(Collectors.toList()).forEach(System.out::println);
	    }

	
	
}
