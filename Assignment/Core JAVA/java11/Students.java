package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;


public class Students {

	 public static void main(String[] args) throws IOException {
	        var paths="/Users/sudhnitkaur/Desktop/StudentList.txt";
	       
	        System.out.println("Students in the list are: ");
	        Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).forEach(System.out::println);
	      
	        int x = (int)Files.lines(Path.of(paths)).filter(Predicate.not(String::isEmpty)).count();
	        System.out.println("Number of students in the list: "+x);
	    }
	
	
}
