package training;

public class JavaTraining {

	public static void main(String[] args) {

		/**String a[] = {"1","2","3","4","5"};
		String b[] = {"3","4","5","6","7"};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0 ; j<b.length ; j++) {
				if(a[i].equalsIgnoreCase(b[j])) {
					System.out.println("The digits are duplicate " + b[j]);
				} else {
					System.out.println("The digits are not duplicate "+a[i]);
				}
			}
		}**/
		
		String str = "Test";
		String rev = "";
		
		for(int i = str.length()-1 ; i>=0 ; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("The reverse string is "+rev);
	} 

}
