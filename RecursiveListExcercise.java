package recursiveListExcercise;
import java.util.ArrayList;

public class RecursiveListExcercise {
	public int longest(ArrayList list, int length) { 
		//The base case should be that the size of the list is 0.  Write a driver to verify that your code is correct.
		if(list.size()==0) return length;

		/*  For each recursive call, remove the first String from the list and return
		 *  the greater of the length of the String you removed or the result of
		 *  calling the method on the remainder of the list.*/
		String temp = (String) list.remove(0); 
		if(length < temp.length()) {
			length = temp.length();
		}
		return longest(list, length); 
	}
}
