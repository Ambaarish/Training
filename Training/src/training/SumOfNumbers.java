package training;


import java.util.Scanner;

public class SumOfNumbers {
	
	static int A[] = {1,2,3,4,5};
	static int total = 0;
	static int number;

	public static void main(String[] args) {
		
		SumOfNumbers add = new SumOfNumbers();
		add.getTheNumber();
		add.calculate(A);
					
	}
	
	public void getTheNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from array");
		number = sc.nextInt();
		sc.close();
	}
	
	public void calculate(int A[]) {
		 while(number < 0) {
			 System.out.println("The number is not available");
		 } 
		 while(number > 0){
			 
			 for(int i=0 ; i<A.length ; i++) {
				 if(A[i] == number) {
					 number = 0;
				 } else {
					 total += A[i];
				 }
				  
				
				 
			 }
			 System.out.println("The addition in array is "+total);
			 
		 }
		 
	}

}
