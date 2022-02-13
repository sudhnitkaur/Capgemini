package StringClass;

public class Operations {
    public static void main(String[] args){
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
       String str1 = "java string pool refers to collection of strings which are stored in heap memory";
        String result1 = str.toLowerCase();
        String result2 = str.toUpperCase();
        String result3 = str.replace('a', '$');
        boolean result4 =  str.contains("Collections");
        boolean result5 = str.equals(str == str1);
        
        System.out.println("Original String  : " + str);
        System.out.println("Lowercase String : " + result1);
        System.out.println("Uppercase String : " + result2);
        System.out.println("Replaced a with $ :"   + result3);
        System.out.println("Does the string contains word Collections:"   + result4);
        System.out.println("New string matches original:"   + result5);
        
        
    }
}
