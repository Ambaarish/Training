package training;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "ASDF";
		String rev ="";
		
		
		/*int len = str.length();
		
		
		for(int i=len-1 ; i>=0 ; i-- ) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("The reverse string is "+rev);*/
		
		/*char a[] = str.toCharArray();
		int len = a.length;
		
		for(int i=len-1 ; i>=0 ; i--) {
			rev = rev+a[i];
		}
		
		System.out.println("The reverse string is "+rev);*/
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("The reverse string is "+sb.reverse());
	

}
	
}
