package training;

public class Training3 {


	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int total = 0;
		int count = 0;
		
		for(int i=0 ; i<a.length ; i++) {
			total += a[i];
			count++;
		}
		System.out.println("The total number is "+total);
		System.out.println("The number of counts is "+count);
	}

}
