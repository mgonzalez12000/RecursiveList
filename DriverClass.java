package recursiveListExcercise;

import java.util.ArrayList;

public class DriverClass {
	public static void main(String[] args) { 
		RecursiveListExcercise newRecursiveListExcercise = new RecursiveListExcercise();
		ArrayList<String> list = new ArrayList<>();
		list.add("Playstation 5");
		list.add("Xbox Series X");
		list.add("Iphone 12 Pro");
		list.add("PS4");
		list.add("This is definately the longest string in this list");

		System.out.println("The length of the longest string is: " + newRecursiveListExcercise.longest(list, 0));
	}
}
