package training;

import java.util.Arrays;

public class Anagram {
	
	

	public static void main(String []args) {
		
		String text1 = "Test";
		String text2 = "Tset";
		
		char arr1[] = text1.toCharArray();
		char arr2[] = text2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String sortedString1 = new String(arr1);
		String sortedString2 = new String(arr2);
		
		if(sortedString1.equalsIgnoreCase(sortedString2)) {
			System.out.println("It is anagram");
		} else {
			System.out.println("It is not anagram");
		}
		
		
		
		
		
		
	}
	
}