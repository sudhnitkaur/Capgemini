package java11;


import java.util.ArrayList;
import java.util.Arrays;


public class ArrauList {
	public static void main(String[] args) {
        String str="A quick brown fox jumps over lazy dog";
        ArrayList<String> stringarray=new ArrayList<>();
      
        stringarray.addAll(Arrays.asList(str.split(" ")));
        System.out.println(stringarray);
        String[] array= stringarray.toArray(new String[0]);
        Arrays.stream(array).forEach(o-> System.out.println(o));
    }
}
