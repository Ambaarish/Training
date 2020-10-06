package training;

import java.util.Arrays;

public class CloneMethod {
	
	

	public static void main(String[] args) {

		int A[] = {1,2,3,4,5};
		//int B[] = A.clone();
		
		System.out.println(Arrays.toString(A));
		//System.out.println(Arrays.toString(B));
		
		A[4] = 550;
		int B[] = A.clone();
		
		System.out.println();
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
	}

}
