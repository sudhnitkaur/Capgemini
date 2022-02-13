package assignment;

import java.util.*;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
    {
      String test1 = new String();
      test1 = "passed";
      String test2 = new String();
      test2 = "promoted";
      String test3 = new String();
      test3 = "failed";
      if( subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
      {
        return test1;
      }
      else if(( subject1Marks>60 && subject2Marks>60 && subject3Marks<60)||( subject1Marks>60 && subject2Marks<60 && subject3Marks>60)||( subject1Marks<60 && subject2Marks>60 && subject3Marks>60))
      {
        return test2;
      }
      else  return test3;
    }
}

public class Assignment1Q4 {
    public static void main(String[] args)
    {
      ResultDeclaration rd = new ResultDeclaration();
      Scanner scanner = new Scanner(System.in);
      double  subject1Marks = scanner.nextDouble();
      double subject2Marks = scanner.nextDouble();
      double subject3Marks = scanner.nextDouble();
      String result = rd.declareResults( subject1Marks,subject2Marks,subject3Marks);
      System.out.println(result);
    }
}