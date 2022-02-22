package StringBufferclass;

public class Stringinsert2{
public static String insertString(
		String originalString,
		String stringToBeInserted,
		int index)
	{		
		StringBuffer newString
			= new StringBuffer(originalString);
		newString.insert(index + 1, stringToBeInserted);
		return newString.toString();
	}
	public static void main(String[] args)
	{
		String originalString = "It is used to _ at the specified index position";
		String stringToBeInserted = "insert text";
	    int index = 13;
		 System.out.println("Original String: "
						+ originalString);
		System.out.println("String to be inserted: "
						+ stringToBeInserted);
		System.out.println("String to be inserted at index: "
						+ index);
	System.out.println("Modified String: "
						+ insertString(originalString,
										stringToBeInserted,
										index));
	}
}
