package training;

public class Swaptwonos {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		//int c=a;
		//a=b;
		//b=c;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		
		System.out.println("The value after swapped "+a+" "+b);
	}

}
