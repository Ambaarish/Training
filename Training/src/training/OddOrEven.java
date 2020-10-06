package training;

import java.util.Scanner;

public class OddOrEven {
	
	static int number;
	

	public static void main(String[] args) {

		OddOrEven check = new OddOrEven();
		check.getTheNumber();
		check.checkNumber();
				
	}
	
	public void getTheNumber() 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number ");
	number = sc.nextInt();
	sc.close();
	}
	
	public void checkNumber() {
		
		while(number < 0) {
			System.out.println("Please enter value above zero");
			break;
		}
		
		while(number!=0 && number > 0) {
			
			number -= 2;
			if(number == 0) {
				System.out.println("Its even number");
				break;
			} else if(number ==-1) {
				System.out.println("Its odd number");
				break;
			}
			
			
		}
	}

}
