package assignment;

import java.util.*;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
      for(int i=0;i<15;i++)
      {
        if(toCheckValue==arr[i])
        {
          return true;
        }
      }
      return false;
    }
}

public class Assignment1Q7 {
    public static void main(String[] args) {
      SearchArray sa = new SearchArray();
      int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
      int valueToCheck = 19;
      boolean b = sa.searchArray(arr,valueToCheck);
      System.out.println(b);
}
}