package training;

public class PalindromeOfNumberAndCharacter {

	public static void main(String[] args) {

		String num1 = "1221";
		String name1 = "AQQA";
		
		int ln = num1.length();
		
		String rev = "";
		
		System.out.println("The length of the string is "+ln);
		
		
		for(int i=ln-1;i>=0;i--) {
			rev += num1.charAt(i);
		}
		
		System.out.println("The reverse string is "+rev);
		
		if(rev.equalsIgnoreCase(num1)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
	}

}
