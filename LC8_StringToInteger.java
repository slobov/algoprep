/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String args[])
	{
		int decimalExample = Integer.parseInt("20");
		int signedPositiveExample = Integer.parseInt("+20");
		int signedNegativeExample = Integer.parseInt("-20");
		int radixExample = Integer.parseInt("20",16);
		int stringExample = Integer.parseInt("geeks",29);

		// Uncomment the following code to check
		// NumberFormatException

		// String invalidArguments = "";
		// int emptyString = Integer.parseInt(invalidArguments);
		// int outOfRangeOfInteger = Integer.parseInt("geeksforgeeks",29);
		// int domainOfNumberSystem = Integer.parseInt("geeks",28);

// 		System.out.println(decimalExample);
// 		System.out.println(signedPositiveExample);
// 		System.out.println(signedNegativeExample);
// 		System.out.println(radixExample);
// 		System.out.println(stringExample);
		
		System.out.println(myParseInt("25"));
		System.out.println(myParseInt("-25"));
		System.out.println(myParseInt("+25"));
	}
	
	private static int myParseInt(String str) {
	    int idx = str.length() - 1;
	    int size = idx;
	    int result = 0;
	    while(idx >= 0) {
            if (str.charAt(idx) == '+') {
                idx--;	
                break;
            }
            
            if (str.charAt(idx) == '-') {
                result *= -1;
                idx--;
                break;
            }
            
            result += (str.charAt(idx) - '0') * Math.pow(10, size - idx);
            idx--;
	    }
	    
	    return result;
	}
}
